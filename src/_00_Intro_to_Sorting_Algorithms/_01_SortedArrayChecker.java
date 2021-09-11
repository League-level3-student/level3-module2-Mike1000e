package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
    	double num = arr[0];
		for(int f = 1; f < arr.length; f++) {
			if(num>arr[f]) {
				
				return false;
				
			}
			num = arr[f];
		}
	
	return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    static boolean doubleArraySorted(double[] dubel) {
    	double num = dubel[0];
    		for(int f = 1; f < dubel.length; f++) {
    			if(num>dubel[f]) {
    				
    				return false;
    				
    			}
    			num = dubel[f];
    		}
    	
		return true;
    }


    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    static boolean charArraySorted(char[] striang) {
    	char strizng = striang[0];
    		
    	for(int f = 1; f < striang.length; f++) {
    			if(strizng > striang[f]) {
    				return false;
    			}
    			strizng = striang[f];
    		}
    	
		return true;
    }


    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    static boolean stringArraySorted(String[] stringz) {
    	String striang = stringz[0];
    	for(int f = 1; f < stringz.length; f++) {
    		if(striang.compareTo(stringz[f])>0) {
    			return false;
    			
    		}
    		striang = stringz[f];
    	}
    	
    	
    	
		return true;
    }

}
