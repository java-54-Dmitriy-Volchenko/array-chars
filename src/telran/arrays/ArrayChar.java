package telran.arrays;

public class ArrayChar {
   private char[] array;
   
   
   public ArrayChar(char[] array) {
	  // super();
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
   
   		public int myCountChar(char character) {
   			int occurence = 0;
   			for(int i=0; i<array.length; i++) {
   				if (array[i]==character)occurence++;
   				// array[i]==character?occurence++:occurence;
   			}
   				return occurence;
}
   		
   		public int myCompareToIgnoreCase(ArrayChar another) { 
   				int length = Math.min(this.array.length, another.array.length);
   					int index=0;
   	   
   						while(index<length && Character.toLowerCase(this.array[index])== Character.toLowerCase(another.array[index])) {
   						index++;
   	  }
   				return index==length?this.array.length - another.array.length:this.array[index]-another.array[index];
      }
   	  
   		public boolean myContains(char character) {      	 
   				
   				return myIndexOf(character)==-1?false:true;
        }
   		
   		public boolean myEquals(ArrayChar another) {      	 
				if(this.array.length==another.array.length) {
					int index=0;
					while(index<this.array.length && this.array[index]== another.array[index]) {
						index++;
					}
					return index==this.array.length?true:false;
				}
				else return false;
    }
   		
   		public boolean myEqualsIgnoreCase(ArrayChar another) {      	 
			if(this.array.length==another.array.length) {
				int index=0;
				while(index<this.array.length && Character.toLowerCase(this.array[index])== Character.toLowerCase(another.array[index])) {
					index++;
				}
				return index==this.array.length?true:false;
			}
			else return false;
}


   		
}

