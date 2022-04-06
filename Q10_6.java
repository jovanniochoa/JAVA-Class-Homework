//This program calculates and gets the array of prime numbers
// it then outputs the array backwards
public class Q10_6 {
	public static void main(String[] args) {
		int[] array = new int[30];
		array = StackOfIntegers.array();

	    System.out.println("Prime numbers from 1 to 120 are :");
	    System.out.print("\n");
	    for (int k = 30-1; k >= 0; k--) {
	    	System.out.print(StackOfIntegers.array[k] + " ");
	    }
	}
}

class StackOfIntegers {
	private static int i =0;
    private static int num =0;
    public static int[] array = new int[30];
    public static int j = 0;
    StackOfIntegers(){
    	
    }
    public static int[] array() {
    	for (i = 1; i <= 120; i++){ 		  	  
	    	int counter=0;
	        for(num =i; num>=1; num--){
	        	if(i%num==0){
	        		counter += 1;
	        	}
	        }
	        if (counter ==2){
	        	array[j] = i;
	        	j++;
	        }
	    }
    	return array;
    }
    
}