package integer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JMath {

	public static HashMap<Integer, Integer> primeDivision(int integer) {
		HashMap<Integer, Integer> decomposition = new HashMap<Integer, Integer>();
		List<Integer> factors = factorization(integer);

		for (int factor : factors) {
			Integer power = decomposition.get(factor);
			if (power == null) power = 0;
			decomposition.put(factor, power + 1);
		}
		return decomposition;

	}

	public static boolean isPrime(int integer) {
		int max = (int) Math.floor(Math.sqrt(integer));

		for (int n = 2; n <= max; n++) {
			if (integer % n == 0) { return false; }
		}
		return true;
	}

	public static boolean isPowerFull(int integer) {
		if (integer == 1) return true;
		HashMap<Integer, Integer> decomposition = primeDivision(integer);

		return !decomposition.containsValue(1);
	}

	public static boolean isPerfectPower(int integer) {
		double n = 1;
		double root, rroot;
		
		do {
			++n;
			rroot = Math.rint(Math.pow(integer, (1.0 /n)));
			root = Math.pow(integer, (1.0 / n));
			
			if (Math.floor(root) == root || Math.floor(rroot) == rroot) return true;
		} while (root > 2);

		return false;
	}

	public static boolean isAchillesNumber(int integer) {
		return isPowerFull(integer) && !isPerfectPower(integer);
	}

	public static int eulerTotient(int integer) {
		double product = 1.0;

		if (integer == 1) return 1;

		for (int p : primeDivision(integer).keySet())
			product *= (1.0 - 1.0 / p);

		return (int) (integer * product);
	}

	public static boolean isStrongAchillesNumber(int integer) {
		return isAchillesNumber(integer) && isAchillesNumber(eulerTotient(integer));
	}

	public static int numberOfStrongAchillesNumberBelow(int integer) {
		int total = 0;
		
		for (int n = 1; n <= integer; n++) {
			if (isStrongAchillesNumber(n)) System.out.println(n);
			if (isStrongAchillesNumber(n)) total += 1;
		}
		return total;
	}
	

	// Private

	private static List<Integer> factorization(int integer) {
		int max = (int) Math.floor(Math.sqrt(integer));
		List<Integer> decomposition = new ArrayList<Integer>();

		if (isPrime(integer)) {
			decomposition.add(integer);
			return decomposition;
		}

		for (int n = 2; n <= max; n++) {
			if (integer % n == 0) {
				decomposition.add(n);
				decomposition.addAll(factorization(integer / n));
				break;
			}
		}
		return decomposition;
	}

}
