package assignment_4;

public class zero_end {
    public static void shift(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
int arr[]={2, 0, 0 ,1, 3, 0 ,0};
shift(arr);
print(arr);
    }
}
