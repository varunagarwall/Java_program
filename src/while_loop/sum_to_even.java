package while_loop;

import java.util.Scanner;

public class sum_to_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= s.nextInt();
        int y=0;
        int z=1;
        while (z<= x){
            if(z%2==0){
                y=y+z;
            }
            z=z+1;
        }
        System.out.println(y);
    }
}
