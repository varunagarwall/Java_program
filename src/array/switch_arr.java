package array;

import java.util.Scanner;

public class switch_arr {
        public static void print_arr(int[] arr) {
            int n = arr.length;
            for (int i = 0; i <=n; i++) {
                System.out.println(arr[i]);
            }
        }

        public static int[] darr() {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            return arr;
        }

        public static int[] new_arr(int[] arr) {

            for (int i = 0; i < arr.length; i=i+2) {
                int a=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=a;

            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = darr();
             new_arr(arr);
             print_arr(arr);

        }
    }
