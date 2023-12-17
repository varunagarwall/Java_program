package pattern;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int x=1;
        while (x<=n){
            int space=1;
            while(space<=n-x){
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=x){
                System.out.print("x");
                j++;
            }
             j=1;
            while (j<=x-1){
                System.out.print("x");
                j++;
            }
            System.out.println();
            x++;

        }
    }
}
