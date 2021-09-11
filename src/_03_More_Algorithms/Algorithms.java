package _03_More_Algorithms;

import java.util.List;

import _01_Sorting_Algorithms.SortingVisualizer;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
   
    public static int findBrokenEgg(List<String> eggs) {
    	int indexOfValue = -1;
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			indexOfValue = i;
    			break;
    		}   	       		
    	}    	
    	 return indexOfValue; 
    }
	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		
    	int indexOfValue = -1;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i).equals(true)) {
    			indexOfValue = i;
    			break;
    		}
			

    		
    	}
		return indexOfValue;
	}
	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		int biggestHeightHolder = 0;
		double largestHeight = 0.0;
		
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > largestHeight) {
				biggestHeightHolder = i;
				largestHeight = peeps.get(i);
			}
		}
		return largestHeight;
	}
	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longestWordsLetters = 0;
	String theLongestWord ="";
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).length()>longestWordsLetters) {
    			longestWordsLetters = words.get(i).length();
    			theLongestWord=words.get(i);
    		}
			

    		
    	}
        return theLongestWord;
    }
	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String value = "... --- ...";
		
    	for(int i = 0; i < message1.size(); i++) {
    		if(message1.get(i).contains(value)) {
    			
    			return true;
    		}
			

    		
    	}
    	return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		
		 int low = 0;
		 int bruh = results.size();
		 int high = bruh-1;
		 
			 int i = low;
		     int j = high;
		     double pivot = results.get(low + (high - low) / 2);
		     while (i <= j) {
		            // 5. make a while loop that increments i while 
		            //    the array element at i is less than pivot
		            while (results.get(i) < pivot) {
		                i++;
		            }
		            // 6. make a while loop that decrements j while 
		            //    the array element at j is greater than pivot
		            while (results.get(j) > pivot) {
		                j--;
		            }
		            // 7. if i is less than or equal to j, 
		            //    swap the array elements at i and j.
		            //    In the same if-statement, increase i by 1 
		            //    and decrease j by 1.
		           
		            }
		     
		     
			return results;	
}
	
	 public static String multiply(int num1, int num2) {
		 String answer;
		 int mathAnswer = num1*num2;
		 	answer = num1 + " x " + num2 + " = " + mathAnswer;
	        return answer;
	    
	    }
	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		for(int j = 2; j < i; j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isSquare(int i) {
		int jSQ;
		// TODO Auto-generated method stub
		for(int j=0; j<i+1; j++) {
			 jSQ = j*j;
			if(jSQ==i) {
				return true;
			
			}
			if(jSQ>i) {
				return false;
			}
			
		}
		return false;
	}
	public static boolean isCube(int i) {
		int jSQ;
		// TODO Auto-generated method stub
		for(int j=0; j<i+1; j++) {
			 jSQ = j*j*j;
			if(jSQ==i) {
				return true;
			
			}
			if(jSQ>i) {
				return false;
			}
			
		}
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

