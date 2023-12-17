package assignment_1;

import java.util.Scanner;

public class terms_ap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int current = 1;
        int count = 1;
        while (count <= n) {
            int num = (3 * current) + 2;
            if (num % 4 != 0) {
                System.out.println(num);
                count++;
            }
            current++;
        }
    }
}