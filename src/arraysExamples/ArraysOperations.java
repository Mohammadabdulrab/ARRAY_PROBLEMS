package arraysExamples;

import java.util.Scanner;
public class ArraysOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int [] arr, int n){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int avg=sum/n;
        System.out.println(sum);
        System.out.println(" "+avg);
        System.out.println(" "+max);

    }
}
