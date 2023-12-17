package Recusion;

public class multiplication {
    public static int multiply(int first_num,int second_num){
if (second_num==0){
    return 0;
}
int ans=multiply(first_num,second_num-1)+first_num;
        return ans;
    }
    public static void main(String[] args) {
System.out.println(multiply(3,4));
    }
}
