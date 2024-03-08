package telran.arrays;

public class ArrayChar {
   private char[] array;
   public ArrayChar(char[] array) {
	  this.array = array;
   }
   public int myCompareTo(ArrayChar another) {//I changed name of method(s) to avoid matching with native methods of class String 
	   int length = Math.min(this.array.length, another.array.length);
	   int index=0;
	  while(index<length &&this.array[index]==another.array[index]) {
		  index++;
	  }
	   return index==length?this.array.length - another.array.length:this.array[index]-another.array[index];
   }
   public int myIndexOf(char character) {
	   int index = 0;
	   while(index<array.length &&array[index]!=character) {
		   index++;
	   }
	   return index==array.length?-1:index;
   }
   
   public int myLastIndexOf(char character) {
	   int index = array.length-1 ;
	   while(index>-1 &&array[index]!=character) {
		   index--;   
	   }
		   return index;
   }
}
   

