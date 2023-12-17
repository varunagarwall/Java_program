package string;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        String str1 = "abaaacdeg";
        String str2 = "defacbaaa";

        int alphabet[] = new int[256];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = 0;
        }

        for (int i = 0; i < str1.length(); i++) {
            int num = str1.charAt(i);
            char al=str1.charAt(i);
            System.out.println(alphabet[al]);
            System.out.println(num);

            alphabet[num] ++;
        }
        System.out.println('\t');

        for (int i = 0; i < str2.length(); i++) {

            int num = str2.charAt(i);
            System.out.println(num);

            alphabet[num] = alphabet[num] - 1;
        }
        System.out.println('\t');

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                System.out.println(i);
                System.out.println("No");
                break;
            }
            else {
                continue;

            }       }



    }
}

