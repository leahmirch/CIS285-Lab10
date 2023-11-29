import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	
    public testSelectionSort() {
    }
    
	/*
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
    */
	
	@Test
    public void testPositive() {
        int[] actual = {8, 9, 7, 10, 2};
        int[] expected = {2, 7, 8, 9, 10};
        SelectionSort sorter = new SelectionSort();
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }
	
	@Test
    public void testNegative() {
        int[] actual = {-3, -1, -4, -2, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        SelectionSort sorter = new SelectionSort();
        actual = sorter.basicSelectionSort(actual);
        assertArrayEquals(expected, actual);
    }
    
    public void testMixed(){
        
    }
    
    public void testDuplicates(){
        
    }
}
