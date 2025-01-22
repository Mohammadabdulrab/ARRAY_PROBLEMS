package arraysExamples;

import java.util.Scanner;
public class SecondlargestFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        SecondLargest(arr,n);
        sc.close();

    }

    public static void SecondLargest(int [] arr,int n){
        int max=Integer.MIN_VALUE;
        int maxi=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxi=i;
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i==maxi){
                continue;
            }
            if(arr[i]>smax){
                smax=arr[i];
            }
        }
        if(smax==max) {
            System.out.println(max);
        }
        else{
            System.out.println(smax);
        }
    }
}
