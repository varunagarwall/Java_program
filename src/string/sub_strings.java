package string;

import java.util.Scanner;

public class sub_strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.next();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));

            }
        }
    }
}
