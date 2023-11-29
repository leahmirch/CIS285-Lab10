// working code

public class SelectionSort {
    private int temp;

    // Creates a new instance of SelectionSort
    public SelectionSort() {
    }

    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j = i + 1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                	
                    // Swapping elements to sort
                    temp = x[i];
                    x[i] = x[j];
                    // Corrected the swapping logic
                    x[j] = temp; // Originally was: temp = x[j];

                    // Original code for reference:
                    // temp = x[i];
                    // x[i] = x[j];
                    // temp = x[j]; // Incorrect swap
                }
            }
        }
        return x;
    }
}
