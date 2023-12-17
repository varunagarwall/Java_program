package array;

import java.util.Scanner;

public class arrange_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0, j = n, counter = 0; i < j; i++, j--, counter++) {
            if (counter % 2 == 0) {
                arr[i] = s.nextInt();
            } else {
                arr[j] = s.nextInt();
            }
        }

        for (int i = 0; i<n; i++){
System.out.println(arr[i]);
        }
    }
}
