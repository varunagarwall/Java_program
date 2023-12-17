package Functions;

import java.util.Scanner;

public class printnum {
    public static void printn(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        printn(num);

    }
}
