package string;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(i);
            if(str.charAt(i)== ' '){
                   int j=i;
                   int counter=str.length()-i;
                    while(counter>1){
                        ans=ans+str.charAt(j+1);
                        System.out.println(str.charAt(j+1));
                        j++;
                        counter--;
                    }
                    ans=ans+" ";

            }
        }
      System.out.println(ans);
    }
}
