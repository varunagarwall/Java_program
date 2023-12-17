package pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
       int j = 1;
       while(j<=x){
           int num=1;
           while(num<=x){
               System.out.print(x);
               num++;
           }
           System.out.println();
          j++;
       }
    }
}
