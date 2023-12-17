import java.sql.Array;
import java.util.Scanner;

public class Binary_search {
    public static boolean Binarr_search(int[] arr,int num){
        int start=0;
        int mid;
        int end=arr.length-1;
        while(start < end){
            mid = (start + end) / 2;
            if(arr[mid] != num){
                if(arr[mid]<num)
                {
                    start=mid+1;
                }
                else if(arr[mid]>num)
                   {
                       end=mid-1;
                   }
                              }
            else if(arr[mid] == num)
            {
                return true;

            }

            }
        return false;
        }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
int num=9;
boolean ans = Binarr_search(arr,num);
System.out.println(ans);

    }
}
