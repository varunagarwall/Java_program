package recursion_array;

public class all_index {
    public static void all(int []arr,int counter,int num){
        if(counter==arr.length){
         return;
        }
        if (num==arr[counter]){
        System.out.println(counter);
        }
        all(arr,counter+1,num);
    }
    public static void main(String[] args) {
int arr[]={1,3,5,6,2,3,7,3};
all(arr,0,3);
    }
}
