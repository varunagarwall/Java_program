package recursion_array;

public class first_index {
    public  static int first(int arr[],int counter,int num) {
        if (counter >=arr.length ) {
            return 0;
        }
        if(num==arr[counter]){
            return counter;
        }

          int ans=  first(arr,counter+1,num);

        return ans;
    }
    public static int last(int[]arr,int counter,int num){
        if (counter ==0){
         return 0;
        }
        if(num==arr[counter]){
            return counter;
        }

        int ans=  last(arr,counter-1,num);

        return ans;
    }


    public static void main(String[] args) {
int arr[]={2,3,5,68,8};
//int ans=first(arr,0,68);
//System.out.println(ans);
System.out.println(last(arr,arr.length-1,8));
}
}