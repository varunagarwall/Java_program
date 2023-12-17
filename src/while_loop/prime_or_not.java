package while_loop;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//prime numbers divi by 2 and number itself
       int x= 2;
       int n= s.nextInt();
        while (x<=n-1){
            if(n%x==0){
                System.out.println("Not Prime");
                return;
            }
            x=x+1;
        }
        System.out.println("prime");
    }
}
