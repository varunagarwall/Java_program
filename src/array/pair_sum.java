package array;

import java.util.Scanner;

public class pair_sum {
        public static void print_arr(int [] arr){
            int n = arr.length;
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
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
     public  static int pair(int[] arr,int sum){
            int counter=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==sum){
                        counter++;
                    }
                }
            }
            return counter;
     }
    public static void main(String[] args) {

            int arr[]=darr();
            Scanner S = new Scanner(System.in);
            int n= S.nextInt();
            int counter=pair(arr,n);
    System.out.println(counter);
        }
}
