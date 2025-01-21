package arraysExamples;
import java.util.Scanner;
public class IndexofArrayElement {

//    Array Problem 1
//    Ruma has given an array arr to Sima such that it consists of n elements.
//
//    Ruma asks Sima to write a program to find out the index of the largest
//    element in present in the array and print the index.
//
//    Your task is to help Sima by writing a program.
//
//    NOTE: Output should be in zero based indexing. If there are multiple
//    occurences of the largest number, return the smallest index.
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem1(n,arr);
        System.out.println(ans);
    }

    public static int ArrayProblem1(int n, int [] arr){
        int max=Integer.MIN_VALUE;
        int max_i=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                max_i=i;
            }
        }
        return max_i;
    }
}
