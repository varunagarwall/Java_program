package array;

import java.util.Optional;
import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr= new int[10];
        int x =0;
        System.out.println("how many integers");
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter" +i +"the element");
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]>x){
                x=arr[i];
            }

        }
        System.out.println(x);
    }
}
