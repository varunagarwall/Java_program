package string;

public class remove_consecutive {
    public static void main(String[] args) {
        String s = "aaabbccdsa";
        String n = " ";
        int startindex = 0;
        int c=0;
        while (startindex < s.length()) {
            char unique = s.charAt(startindex);
            int nextindex = startindex + 1;
c=0;
            while (nextindex< s.length() && s.charAt(nextindex) == unique) {
           c++;
                nextindex++;
            }
            n += unique;
            n+=c;
            startindex = nextindex;
        }
        System.out.println(n);
    }
}
