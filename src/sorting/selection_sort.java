package sorting;

public class selection_sort {

    public static void selection_sort(int[] arr){

int n=arr.length;
 for(int i=0;i<n-1;i++) {
     int min=arr[i];
     int minindex = i;
     for (int j = i+1; j <n; j++) {
      if(arr[j]<min){
         minindex =j;
          min=arr[j];
                   }
               }
     int temp=arr[minindex];
     arr[minindex]=arr[i];
     arr[i]=temp;
               }

    }

    public static void print_arr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr={1,23,9,7,2,10};
selection_sort(arr);

print_arr(arr);
    }

}
