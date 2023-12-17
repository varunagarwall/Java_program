package array;

import java.util.Scanner;

public class sort_0_1 {
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
    public static int[] arr_1(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j) {
        if(arr[i]==0 || arr[j]==1){
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }
        else if(arr[i]==1 || arr[j]==0){
            arr[j]=1;
            arr[i]=0;
            i++;
            j--;
        }

        }

        return arr;
    }
    public static void main(String[] args) {
int []arr=darr();
int []new_array=arr_1(arr);
print_arr(new_array);
    }
}
