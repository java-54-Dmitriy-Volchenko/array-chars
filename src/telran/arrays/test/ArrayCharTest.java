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
	@Test
	void myCountCharTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		char[] ar2 = {'a', '3', '@', '.', ' ', 'k',' ', ' ', 'ך'};
		ArrayChar arrayChar1=new ArrayChar(ar1);
		ArrayChar arrayChar2=new ArrayChar(ar2);
		assertEquals(2, arrayChar1.myCountChar('2'));
		assertEquals(0, arrayChar1.myCountChar('a'));
		assertEquals(3, arrayChar2.myCountChar(' '));
		
		
	}
	
	
	@Test
	void myCompareToIgnoreCaseTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		char[] ar4 = {'h', 'e', 'l', 'l', 'o'};
		char[] ar5 = {'H', 'e', 'l', 'l', 'o'};
		char[] ar6 = {'a'};
		char[] ar7 = {'a', 'A'};
		char[] ar8= {'L'};
		char[] ar9 = {'a'};
				
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		ArrayChar arrayChar5 = new ArrayChar(ar5);
		ArrayChar arrayChar6 = new ArrayChar(ar6);
		ArrayChar arrayChar7 = new ArrayChar(ar7);
		ArrayChar arrayChar8 = new ArrayChar(ar8);
		ArrayChar arrayChar9 = new ArrayChar(ar9);
		assertEquals(8, arrayChar2.myCompareToIgnoreCase(arrayChar1));
		assertEquals(-8, arrayChar1.myCompareToIgnoreCase(arrayChar2));
		assertEquals(1, arrayChar7.myCompareToIgnoreCase(arrayChar6));
		assertEquals(-1, arrayChar6.myCompareToIgnoreCase(arrayChar7));
		assertEquals(0, arrayChar1.myCompareToIgnoreCase(arrayChar3));
		assertEquals(0, arrayChar1.myCompareToIgnoreCase(arrayChar3));
		assertTrue (arrayChar4.myCompareToIgnoreCase(arrayChar5)==0);
		assertTrue(arrayChar8.myCompareToIgnoreCase(arrayChar9) > 0); 
	}
	
	@Test
	void myContainsTest() {
		char[] ar1 = {'a', '3', '@', '.', ' ', 'k',' ', ' ', 'ך'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertTrue (arrayChar1.myContains('@'));
		assertFalse (arrayChar1.myContains('>'));
	}
	@Test
	void myEqualsTest() {
		char[] ar1 = {'a', '3', '@', '.'};
		char[] ar2 = {'a', '3', '@'};
		char[] ar3 = {'a', '3', '@', '.', ' '};
		char[] ar4 = {'a', '2', '@', '.', ' '};
		char[] ar5 = {'a', '3', '@', '.'};
		
		ArrayChar arrayChar1=new ArrayChar(ar1);
		ArrayChar arrayChar2=new ArrayChar(ar2);
		ArrayChar arrayChar3=new ArrayChar(ar3);
		ArrayChar arrayChar4=new ArrayChar(ar4);
		ArrayChar arrayChar5=new ArrayChar(ar5);
		assertTrue (arrayChar1.myEquals(arrayChar5));
		assertFalse(arrayChar1.myEquals(arrayChar2));
		assertFalse(arrayChar1.myEquals(arrayChar3));
		assertFalse(arrayChar1.myEquals(arrayChar4));
	}
	@Test
	void myEqualsIgnoreCaseTest() {
		char[] ar1 = {'a', '3', '@', '.'};
		char[] ar2 = {'a', '3', '@'};
		char[] ar3 = {'a', '3', '@', '.', ' '};
		char[] ar4 = {'a', '2', '@', '.', ' '};
		char[] ar5 = {'A', '3', '@', '.'};
		
		ArrayChar arrayChar1=new ArrayChar(ar1);
		ArrayChar arrayChar2=new ArrayChar(ar2);
		ArrayChar arrayChar3=new ArrayChar(ar3);
		ArrayChar arrayChar4=new ArrayChar(ar4);
		ArrayChar arrayChar5=new ArrayChar(ar5);
		assertTrue (arrayChar1.myEqualsIgnoreCase(arrayChar5));
		assertFalse(arrayChar1.myEqualsIgnoreCase(arrayChar2));
		assertFalse(arrayChar1.myEqualsIgnoreCase(arrayChar3));
		assertFalse(arrayChar1.myEqualsIgnoreCase(arrayChar4));
	}
//	//The last task to find the bug in code and show this in unit test - i think it is possibility to 
	//add to instance of class object null value. This possibility is because of no setters and getters in 
	// our Class so no rules for value assignment. But i don't understand how to show it in tests.
	// The only variant is below
//	@Test
//	void myCheckToNullTest() {
//		   char[] array=null ;
//	        ArrayChar charArray1 = new ArrayChar(array);
//	        assertTrue (charArray1.myContains('a'));
//	        
//	}
}
