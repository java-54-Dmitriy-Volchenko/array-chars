package telran.arrays;

public class ArrayChar {
   private char[] array;
   
   
   public ArrayChar(char[] array) {
	  super();
	//  this.array = array;//source of big critical BUG
	  this.array = new char[array.length];
	  for (int i = 0; i<array.length; i++) {
		  this.array[i]=array[i];
	  }
	  
   }
   public int compareTo(ArrayChar another) {
	   int length = Math.min(this.array.length, another.array.length);
	   int index=0;
	  while(index<length &&this.array[index]==another.array[index]) {
		  index++;
	  }
	   return index==length?this.array.length - another.array.length:this.array[index]-another.array[index];
   }
   public int indexOf(char character) {
	   int index = 0;
	   while(index<array.length &&array[index]!=character) {
		   index++;
	   }
	   return index==array.length?-1:index;
   }
   
   public int lastIndexOf(char character) {
	   int index = array.length-1 ;
	   while(index>-1 &&array[index]!=character) {
		   index--;   
	   }
		   return index;
   }
   
   		public int countChar(char character) {
   			int occurence = 0;
   			for(int i=0; i<array.length; i++) {
   				if (array[i]==character)occurence++;
   				
   			}
   				return occurence;
}
   		
   		public int compareToIgnoreCase(ArrayChar another) {
   		 return compareCommon(another, true);
   	}
      
   		private int compareCommon(ArrayChar another, boolean isIgnoreCase) {
   			int length = Math.min(array.length, another.array.length);
   			int index = 0;
   			int diff = 0;
   			while(index < length && (diff = getDiff(another, index, isIgnoreCase)) == 0) {
		   index++;
	   }
   			return index == length ? this.array.length - another.array.length : 
		   diff;
}
   		private int getDiff(ArrayChar another, int index, boolean isIgnoreCase) {
   			char first = array[index];
   			char second = another.array[index];
   			if (isIgnoreCase) {
   				first = Character.toLowerCase(first);
   				second = Character.toLowerCase(second);
   			}
   			return first - second;
}
   		public boolean contains(char character) {      	 
   				
   				return indexOf(character)>-1;
        }
   		
   		public boolean equals(ArrayChar another) {   			
   			return another != null && compareTo(another) == 0;
   		}
   		
   		
    
   		
   		public boolean equalsIgnoreCase(ArrayChar another) {      	 
			
				int index=0;
				while(this.array.length==another.array.length && index<this.array.length && Character.toLowerCase(this.array[index])== Character.toLowerCase(another.array[index])) {
					index++;
				}
				return another != null && compareToIgnoreCase(another) == 0;
   		}

   		
	}
			


   		


