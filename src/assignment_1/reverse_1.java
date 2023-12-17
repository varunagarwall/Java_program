package assignment_1;

import java.util.Scanner;

public class reverse_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int new_1=0;
        int pow=1;
        while(n>0){
         int dec=n%10;
         n=n/10;
         new_1=(new_1*pow) +dec;
         System.out.println(pow);
         pow=pow*10;
        }
        System.out.println(new_1);
    }
}
