package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int firstNumber = arr[0];
    	int secondNumber = arr[1];
    	arr[0]=secondNumber;
    	arr[1]=firstNumber;
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    		for(int i =0; i < arr.length; i ++) {
    			for(int f = i+1; f < arr.length; f ++) {
    				if(arr[i]>arr[f]) {
    					int tempVar = arr[i];
    					arr[i]=arr[f];
    					arr[f]= tempVar;
    				}
    			}
    		}
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	for(int i =0; i < arr.length; i ++) {
			for(int f = i+1; f < arr.length; f ++) {
				if(arr[i]>arr[f]) {
					int tempVar = arr[i];
					arr[i]=arr[f];
					arr[f]= tempVar;
				}
			}
		}
    	if(arr.length%2==1) {
    	return arr[(arr.length-1)/2];
    	
    	} else {
    		return arr[arr.length/2];
    	}
        
    }
}
