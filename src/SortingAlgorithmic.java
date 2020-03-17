public class SortingAlgorithmic {


    public static void main(String[] args) {



    }

     public static void bubbleSort(int[] array) {
        int i, j, n =array.length;
        for (i=0; i<n; i++) {
            for (j=i+1; j < n; j++)
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } }
                                            }


                                            
     public static void selectionSort(int[] array) {
            int i, j, min, n =array.length;
            for (i=0; i < n; i++) {
                min = i;
                for (j = i+1; j < n; j++ ) {
                    if (array[min] > array[j]) {
                        min = j;
                    }
                    int temp = min;
                    min = i;
                    i = temp;
                }
            }
     }

}
