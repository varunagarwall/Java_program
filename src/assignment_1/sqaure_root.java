package assignment_1;

import java.util.Scanner;

public class sqaure_root {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0;
        int sq=1;
        while(i<n){

            if(i*i>n){
                sq=i-1;

                break;
            }
            i++;

        }
      System.out.println(sq);
    }
}
