package integer;

import java.util.HashMap;

import junit.framework.TestCase;

public class JMathemataTest extends TestCase {

	public void testPrimeDivisionOfIntegerWithPrimeNumber() {
		HashMap<Integer, Integer> decomposition = new HashMap<Integer, Integer>();
		decomposition.put(3, 1);

		assertEquals(decomposition, JMath.primeDivision(3));
	}

	public void testPrimeDivisionOfIntegerWith216() {
		HashMap<Integer, Integer> decomposition = new HashMap<Integer, Integer>();
		decomposition.put(3, 3);
		decomposition.put(2, 3);

		assertEquals(decomposition, JMath.primeDivision(216));
	}

	public void test_1_isApowerfullNumber() {
		assertTrue(JMath.isPowerFull(1));
	}

	public void test_864_isApowerfullNumber() {
		assertTrue(JMath.isPowerFull(864));
	}

	public void test_480_isNotApowerfullNumber() {
		assertFalse(JMath.isPowerFull(480));
	}

	public void test_1_isAperfectPower() {
		assertTrue(JMath.isPerfectPower(1));
	}

	public void test_9_isAperfectPower() {
		assertTrue(JMath.isPerfectPower(9));
	}

	public void test_10_isNotAperfectPower() {
		assertFalse(JMath.isPerfectPower(10));
	}

	public void test_216_isAperfectPower() {
		assertTrue(JMath.isPerfectPower(216));
	}

	public void test_864_isAchillesNumber() {
		assertTrue(JMath.isAchillesNumber(864));
	}

	public void test_1800_isAchillesNumber() {
		assertTrue(JMath.isAchillesNumber(1800));
	}

	public void test_784_isAchillesNumber() {
		assertFalse(JMath.isAchillesNumber(784));
	}

	public void test_647_isAchillesNumber() {
		assertFalse(JMath.isAchillesNumber(647));
	}
	
	public void test_3375_isNotAchillesNumber() {
		assertEquals(false,JMath.isAchillesNumber(3375));
	}
	public void test_3375_isPerfectPower() {
		assertTrue(JMath.isPerfectPower(3375));
	}
	
	public void testEulerTotientOf_1_is_1() {
		assertEquals(1, JMath.eulerTotient(1));
	}

	public void testEulerTotientOf_864_is_288() {
		assertEquals(288, JMath.eulerTotient(864));
	}

	public void testEulerTotientOf_2310_is_480() {
		assertEquals(480, JMath.eulerTotient(2310));
	}

	public void testEulerTotientOf_30030_is_5760() {
		assertEquals(5760, JMath.eulerTotient(30030));
	}
	public void testEulerTotientOf_500_is_200() {
		assertEquals(200, JMath.eulerTotient(500));
	}
	

	public void test_864_isStrongAchillesNumber() {
		assertTrue(JMath.isStrongAchillesNumber(864));
	}

	public void test_1800_isNotStrongAchillesNumber() {
		assertFalse(JMath.isStrongAchillesNumber(1800));
	}
	
	public void test_500_isNotStrongAchillesNumber() {
		
		assertFalse(JMath.isStrongAchillesNumber(500));
	}

	public void testNumberOfStrongAchillesNumberBelow_10E4_is_7() {
		assertEquals(7, JMath.numberOfStrongAchillesNumberBelow((int) Math.pow(10, 4)));
	}

	public void xtestNumberOfStrongAchillesNumberBelow_10E8_is_656() {
		assertEquals(7, JMath.numberOfStrongAchillesNumberBelow(10 ^ 8));
	}

}
