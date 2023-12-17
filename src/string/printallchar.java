package string;

import java.util.Scanner;

public class printallchar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str);
System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
