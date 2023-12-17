package while_loop;

import java.util.Scanner;

public class Fare_cal {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int s = sca.nextInt();
        int e = sca.nextInt();
        int w = sca.nextInt();

        while (s <= e) {
            int c =((5)*(s-32))/(9);
            System.out.println(s +" "+ c);
            s=s+w;
        }
    }
}
