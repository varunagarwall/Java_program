package pattern;

import java.util.Scanner;

public class number_square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 1;
        while (i <= x) {
         int j=1;
         while(j<=x){
             System.out.print(j);
             j++;
         }
             System.out.println();
         i++;

        }
    }
}
