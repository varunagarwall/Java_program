package pattern;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class new_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j=1;
        int val=1;
        while(j<=i){
            int k=1;
            while (k<=j){
                System.out.print(val);
                k++;
                val++;
            }
            System.out.println();
            j++;

        }
    }
}
