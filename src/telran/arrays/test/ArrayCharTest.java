package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void myCompareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.myCompareTo(arrayChar1));
		assertEquals(-8, arrayChar1.myCompareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'})
				.myCompareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.myCompareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.myCompareTo(arrayChar3));
	}
	@Test
	void myIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		assertEquals(1, arrayChar1.myIndexOf('2'));
		assertEquals (-1, arrayChar1.myIndexOf('9'));
}
	@Test
	void myLastIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		assertEquals(3, arrayChar1.myLastIndexOf('2'));
		assertEquals (-1, arrayChar1.myLastIndexOf('9'));
}
	
	
}