package Recusion;

import java.util.Scanner;

public class power_of_number {
    public static int power(int num,int power){
        if(power==0){
            return 1;
        }
        int ans=(power(num,power-1))*num;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
System.out.println(power(3,4));
    }
}
