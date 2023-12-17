package sorting;

public class merge_sort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

    }

    public static void sort_3(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0) {
                System.out.println(j);
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                }
                j--;
            }
            arr[j + 1] = temp;
            print(arr);

        }
    }

    public static void sort_2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] sort_4(int arr1[], int[] arr2) {
        int[] z = new int[arr1.length + arr2.length];
        int counter = 0;
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                z[counter] = arr1[i];
                counter++;
                i++;
            } else if (arr1[i] >= arr2[j]) {
                z[counter] = arr2[j];
                counter++;
                j++;
            }
        }
      while (i < arr1.length) {
            z[counter] = arr1[i];
            counter++;
            i++;
        }
        while (j < arr2.length) {
            z[counter] = arr2[j];
            counter++;
            j++;
        }
        return z;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4};
        int[] arr2 = {16, 3, 1, 7, 11};
        sort_2(arr);
        sort_2(arr2);
//print(arr);
//print(arr2);
        int[] new_aray = sort_4(arr, arr2);
        print(new_aray);



if(2>4){
    System.out.println("yes");
}
    }
}
