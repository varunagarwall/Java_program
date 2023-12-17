package ifelse;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
//        int y= s.nextInt();
//        int z= s.nextInt();
//
//        if (x >= y  && x >= z ) {
//            System.out.println(x);
//        }else{
//            if(y >= x && y>= z){
//                System.out.println(y);
//            }else{
//                System.out.println(z);
//            }
//        }
//        if (x>y && x>=z){
//            System.out.println(x);
//        }
//        else if (y>=x && y>=z){
//            System.out.println(y);
//        } else if (z>=x && z >=y) {
//            System.out.println(z);
//        }
 if(x==1){
     System.out.println("one");
 }
 else if (x==2){
     System.out.println("Two");
 }
 else if (x==3){
     System.out.println("Three");
 }
    }
}
