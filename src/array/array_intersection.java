package array;

import java.util.Scanner;

public class array_intersection {
    public static int[] new_arr(int[] arr1,int[] arr2){
        int [] new_array= new int[arr1.length+arr2.length];
        int counter=0;
       for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
            new_array[counter]=arr1[i];
            arr2[j]=0;
            counter++;
            }
        }
       }
       return new_array;
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
    public static void print_arr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
    int arr1[]=darr();
    int arr2[]=darr();
    int []new_array=new_arr(arr1,arr2);
    print_arr(new_array);
    }
}
