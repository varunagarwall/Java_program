package for_loop;

import java.util.Scanner;

public class fibonaci_series {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        int a=1;
        int b=1;
        int c = 0;
        for(int i=9;i<=n;i++){
           c=a+b;
            a=b;
            b=c;

        }
        System.out.print(c);
    }

}
