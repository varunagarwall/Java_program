package while_loop;

import java.util.Scanner;

public class print_1_to_n {
    public static void main(String[] args) {
        int x= 1;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(x<=n){
            System.out.println(x);
            x=x+1;
        }

    }
}
