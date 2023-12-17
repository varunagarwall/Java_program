package sorting;

public class bubble_sort {
    public static void bubble_sort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
    }
    public static void print_arr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
        }
    }

        public static void main(String[] args) {
            int[] arr={1,23,9,7,2,10,3,4,67,7};
            bubble_sort(arr);

            print_arr(arr);
        }

    }