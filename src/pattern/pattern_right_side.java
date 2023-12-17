package pattern;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class pattern_right_side {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i = s.nextInt();
        int x=1;
        int val=1;
        while (x<=i){
            int space=1;
                while(space<=i-x){
                    System.out.print(" ");
                     space++;
                }
            int j=1;
              while (j<=x){
                 System.out.print(val);
                val=val+1;
                 j=j+1;
            }
            System.out.println();
            x=x+1;
        }
    }
}
