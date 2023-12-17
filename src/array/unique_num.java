package array;

import java.util.Scanner;

public class unique_num {

public static int uni(int [] arr) {

    for (int i = 0; i < arr.length; i++) {
        int j;
        for ( j = 0; j <arr.length; j++) {
            if (i != j) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
        }
        if (j == arr.length) {
            System.out.println(j);
            return arr[i];
        }
    }
    return Integer.MAX_VALUE;
}

    public static int[] darr() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
       int arr[]=darr();
      int num=uni(arr);
           System.out.println(num);
    }
}
