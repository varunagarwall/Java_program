package Functions;

import java.util.Scanner;

public class ncr {

    public static int factorial(int x){
        int num=1;
        for(int i=1;i<=x;i++){
            num*=i;

        }
        return num;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int num = factorial(n);
        int den= factorial(r);
        int diff= factorial(n-r);

        int ans=num/(den*diff);
        System.out.println(ans);
    }
}
