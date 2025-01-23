package arraysExamples;

import java.util.Scanner;
public class ReverseofArray {

//    Reverse an array
//    You are given an array arr of length n. You have to come up with an
//    in-place solution.

//    Input-> 4
//            1 3 5 7
//    Output-> 7 5 3 1

    public static void reverseArray(int [] arr1){
        int n=arr1.length;
        int b[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            b[j]=arr1[i];
            j++;
        }
        for(int i=0;i<n;i++){
            arr1[i]=b[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1);

        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
        System.out.println('\n');
    }
}
