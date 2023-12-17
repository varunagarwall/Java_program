package assignment_1;

import java.util.Scanner;

public class dec_bin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         long new_1=0;
         int pow=1;
        while(n>0){
            int dec=n%2;
            new_1=dec*pow + new_1;
            pow*=10;
            n=n/2;
        }
        System.out.println(new_1);
    }
}
