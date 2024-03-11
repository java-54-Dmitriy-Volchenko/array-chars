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
   public int compareTo(ArrayChar another) {//I changed names of method(s) to avoid matching with native methods of class String 
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
   				int length = Math.min(this.array.length, another.array.length);
   					int index=0;
   	   
   						while(index<length && Character.toLowerCase(this.array[index])== Character.toLowerCase(another.array[index])) {
   						index++;
   	  }
   				return index==length?this.array.length - another.array.length:Character.toLowerCase(this.array[index])-Character.toLowerCase(another.array[index]);
      }
   	  
   		public boolean contains(char character) {      	 
   				
   				return indexOf(character)>-1;
        }
   		
   		public boolean equals(ArrayChar another) {   			
					int index=0;
					while(this.array.length==another.array.length && index<array.length && this.array[index]== another.array[index]) {
						index++;}									
					return index==this.array.length?true:false;
   		}
   		
   		public boolean equals1(ArrayChar another) {   			
											
			return another!=null && compareTo(another)==0; //avoiding null pointer exception
	}
    
   		
   		public boolean equalsIgnoreCase(ArrayChar another) {      	 
			
				int index=0;
				while(this.array.length==another.array.length && index<this.array.length && Character.toLowerCase(this.array[index])== Character.toLowerCase(another.array[index])) {
					index++;
				}
				return index==this.array.length?true:false;
			}
			
}

   		


