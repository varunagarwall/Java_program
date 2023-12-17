package array;

import java.util.Scanner;


public class pair_array {
    public static int[] new_arr(int[] arr){
        Scanner s = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void pair_ar(int[] arr){
        int i=0;
        while(i<arr.length){
            int j=i+1;
            while(j<arr.length){
                System.out.println(arr[i]+","+arr[j]);
            j++;
            }
            i++;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        arr=new_arr(arr);
        pair_ar(arr);

    }
}
