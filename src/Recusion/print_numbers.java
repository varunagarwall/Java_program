package Recusion;

import java.util.Scanner;

public class print_numbers {
    public  static  void print(int num){
        if(num==0){
            System.out.println(0);
            return;
        }
        System.out.println(num);
        print(num-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        print(num);
    }
}
