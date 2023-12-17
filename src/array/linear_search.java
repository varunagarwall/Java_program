package array;

import java.util.Scanner;

public class linear_search {

    public static int linear_search(int[ ] arr,int var,int pos){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==var){
                pos=i;
                return pos;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int n_find=s.nextInt();
        int[] arr = new int[n];
        int pos=0;
        for(int i=0;i<n;i++){
            System.out.println("enter" +i +"the element");
            arr[i]=s.nextInt();
        }


        System.out.println(linear_search(arr,n_find,pos));
    }
}
