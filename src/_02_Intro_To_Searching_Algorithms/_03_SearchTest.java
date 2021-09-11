package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        
        String[] array = {"hi", " bye", "hello", "goodbye", "whats up"};
        assertEquals(0, _01_LinearSearch.linearSearch(array, "hi"));
        
        String[] array2 = {};
        assertEquals(-1, _01_LinearSearch.linearSearch(array2, ""));
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array musassertEquals(false, true);
        int[] aray = {4, 3, 1, 9, 8};
        assertEquals(2, _02_BinarySearch.binarySearch(aray, 0, aray.length, 1));
        		
       
    }
}
