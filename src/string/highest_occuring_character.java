package string;

import java.util.Scanner;

public class highest_occuring_character {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        String str1="abdefgbabfba";

        int alphabet[]= new int[256];

        for(int i=0;i<256;i++){
            alphabet[i]=0;
        }

        for(int i=0;i<str1.length();i++){
        int num=str1.charAt(i);
        alphabet[num]++;

        }

        int max=0;
        int index=0;
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]>max){
                max=alphabet[i];
                index=i;
            }
        }
        char s1=(char)index;
        System.out.println(s1);

    }
}
