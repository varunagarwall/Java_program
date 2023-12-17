package Recusion;

import java.util.Scanner;

public class number_of_digits {
    public static int count(int num){
        if(num==0){
            return 0;
        }
        int ans=count(num/10)+1;
    return ans;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
   int num=s.nextInt();
       count(num);
        System.out.println( count(num));
    }
}
