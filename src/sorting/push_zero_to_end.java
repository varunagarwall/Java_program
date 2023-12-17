package sorting;

import java.util.Scanner;

public class push_zero_to_end {

    public  static void sort(int [] arr) {
        int nonzero=0;
        int zero=0;
        while(zero<arr.length) {
            if (arr[zero] != 0) {
                int temp = arr[nonzero];
                arr[nonzero] = arr[zero];
                arr[zero] = temp;
                nonzero++;
                zero++;
            } else {
                zero++;
            }
        }
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num={0, 1, 2, 0, 2, 0, 1};
         sort(num);
        print(num);
    }
}
