package string;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str2="";

        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
System.out.println(str2);
        }
        System.out.println(str2);
//        System.out.println(str.length());
    }
}
