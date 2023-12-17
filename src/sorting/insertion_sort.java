package sorting;

public class insertion_sort {
    public static void insertion_sort1(int[]arr) {
        for (int i = 1; i < arr.length ; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            j=j+1;
            arr[j] = temp;
        }
    }
        public static void print_arr(int[] arr) {
            int n = arr.length;
            for (int i = 0; i <n; i++) {
                System.out.println(arr[i]);
            }
        }
    public static void main(String[] args) {
     int [] arr={1,4,2342,5453,212,12};
insertion_sort1(arr);
     print_arr(arr);
    }
}
