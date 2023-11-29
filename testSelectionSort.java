//non working code

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
    }
    
    public void testNegative(){
        
    }
    
	@Test
    public void testMixed() {
        int[] actual = {3, -1, 0, -2, 5};
        int[] expected = {-2, -1, 0, 3, 5};
        SelectionSort sorter = new SelectionSort();
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }
	
	@Test
    public void testDuplicates() {
        int[] actual = {3, -1, -1, 3, 0};
        int[] expected = {-1, -1, 0, 3, 3};
        SelectionSort sorter = new SelectionSort();
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }
}