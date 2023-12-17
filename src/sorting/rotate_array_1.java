package sorting;

import java.util.Scanner;

public class rotate_array_1 {

    public static void rotate(int[] arr,int num){
        for (int i = num; i < arr.length ; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            j=j+1;
            arr[j] = temp;
        }
        }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[]={1, 2, 3, 4, 5, 6, 7};
        int num =s.nextInt();
        rotate(arr,num);
        print(arr);

    }
}
