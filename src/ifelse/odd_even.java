package ifelse;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int num= x%2;
//        if (num==0) {
//            System.out.println("Even");
//        }
//        else  {
//            System.out.println("odd");
//        }
        if (num==0){
            System.out.println("Even");
            return;
        }
        System.out.println("odd");



    }


}
