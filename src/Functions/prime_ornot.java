package Functions;

import java.util.Scanner;

public class prime_ornot {
    public static boolean prime(int x){
       int d=2;
        while(d<=x){
            if(x%d==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean ans = prime(num);
        System.out.println(ans);

    }
}
