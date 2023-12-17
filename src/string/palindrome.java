package string;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int i=0;
        boolean ans=false;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
              ans = false;
              break;
            }
            i++;
            j--;
            }



        if(i==j){
            ans=true;
        }


System.out.println(ans);
    }
}
