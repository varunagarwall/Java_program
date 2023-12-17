package pattern;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    int n = 1;
    while(n<=i) {
        int j=n;
        int k=1;
               while(k<=i){
               System.out.print(j);
                k++;
         }
               System.out.println();
        n++;
    }
}
}
