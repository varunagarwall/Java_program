package sorting;

import java.util.Scanner;

public class second_largest {

    public static int second_2(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int max=Integer.MIN_VALUE;
            int minindex=-1;
            for(int j=i;j<arr.length;j++){
              if(arr[j]>max){
              max=arr[j];
              minindex=j;
             }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        return arr[1];
    }
    public static int second(int []arr){
        int large=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second=large;
                large=arr[i];
                System.out.println( second);
            }
            if(arr[i]==large ) {
                continue;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,21,214,5,5,12,412};
        System.out.println(second_2(arr));
    }
}
