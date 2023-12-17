package array;

import java.util.Scanner;

public class declare {
    public static void print_arr(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static int sum(int[] arr){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        return sum;
    }
    public static   int[] darr(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = darr();
//        print_arr(arr);
    System.out.println(sum(arr));
    }
}
