package arraysExamples;

import java.util.Scanner;
public class Building {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        buildings(arr, n);
    }

    public static void buildings(int [] arr,int  n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int k=max;
        for(int i=1;i<=max;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>=k){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
            k--;
        }
    }
}
