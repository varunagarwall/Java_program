package array;

import java.util.Scanner;

public class duplicate {
    public static int dup(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }

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
int dupo=dup(arr);
    System.out.println(dupo);
    }
}
