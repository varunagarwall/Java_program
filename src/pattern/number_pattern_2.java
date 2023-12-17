package pattern;

import java.util.Scanner;

public class number_pattern_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i= s.nextInt();
        int x=0;
        int val=1;
        while(x<=i){
            int space=1;
            while(space <=i-x){
                System.out.print(" ");
                space++;

            }
            int j=1;
            val=x;
            while(j<=x){
                System.out.print(val);
            val=val+1;
            j++;
            }

            System.out.println();
         x++;
        }
    }
}
