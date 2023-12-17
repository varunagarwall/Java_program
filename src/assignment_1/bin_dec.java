package assignment_1;

import java.util.Scanner;

public class bin_dec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i=1,new_1=0;
        int temp=n;
        int bin=n;
        while(temp>0){
           bin=temp%10;
            new_1=bin*i + new_1;
            i*=2;
            temp=temp/10;
        }
        System.out.println(new_1);
    }
}
