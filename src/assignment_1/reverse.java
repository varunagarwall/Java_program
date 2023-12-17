package assignment_1;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int rev=0;
        int temp=n;
        while(temp>0){
            int mod=temp%10;
            rev=(rev*10) + mod;
            temp=temp/10;
        }
        System.out.println(rev);
    }
}
