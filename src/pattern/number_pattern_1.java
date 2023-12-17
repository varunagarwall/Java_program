package pattern;

import java.util.Scanner;

public class number_pattern_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int x=1;
        int val =1;
        while (x<=i){
            int j=1;
            val=x;
            while(j<=x){
                System.out.print(val);
                val++;
                j=j+1;
            }
            System.out.println();
            x=x+1;
        }

    }
}
