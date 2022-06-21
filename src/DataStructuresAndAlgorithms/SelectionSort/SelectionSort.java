package DataStructuresAndAlgorithms.SelectionSort;

public class SelectionSort {
    public void sort(int[] array){
        int n = array.length;

        // Find the minimum element in unsorted array
        for(int i = 0; i < n-1; i++){
            //Initialize minimal_index to location i    i.e    0.
            int minimal_index = i;

            for(int j= i+1; j < n; j++){
                if(array[j] < array[minimal_index]){
                    // If value at jth index is smaller than value at minimal_index, then set minimal element as j.
                    minimal_index = j;
                }
            }

            // Swap the found minimum element with the first element;
            int temp = array[minimal_index];
            array[minimal_index] = array[i];
            array[i] = temp;
        }

        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


/*
* SPACE COMPLEXITY: 0(1)
* TIME COMPLEXITY: 0(n^2)
*
*
* No more than 0(n) swaps are required
* It is used when memory write operations are costly.
* */
