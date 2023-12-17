package pattern;

import java.util.Scanner;

public class pattern_123 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int x=1;
        while (x<=i){
            int j=1;
            while(j<=x){
                System.out.print(j);
                j=j+1;
            }
            System.out.println();
            x=x+1;
        }
    }
}
