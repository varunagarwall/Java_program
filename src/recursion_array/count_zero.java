package recursion_array;

public class count_zero {
    public static int zero(int num,int ans){
        if(num==0){
            return 0;
        }
        if(num%10==0){
            return zero(num/10,ans)+1;
        }

        ans=zero(num/10,ans);

        return ans;
    }
    public static void main(String[] args) {
System.out.println(zero(1,0));
System.out.println(0%10);
boolean ans=0<10;
System.out.println(ans);
    }
}
