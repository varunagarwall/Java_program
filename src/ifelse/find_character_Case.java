package ifelse;

import java.util.Scanner;

public class find_character_Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char c = a.charAt(0);

 if( c>=65 && c <= 91) {
     System.out.println(1);
 }
   else if (c >=97 && c <= 122){
System.out.println(0);
    }
   else{
       System.out.println(-1);

 }
    }
}
