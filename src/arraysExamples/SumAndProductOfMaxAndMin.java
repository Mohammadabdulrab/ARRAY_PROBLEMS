package arraysExamples;

import java.util.Scanner;

public class SumAndProductOfMaxAndMin {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();

    while(t-- > 0)
    {
        long n = sc.nextLong();
        long arr[] = new long[(int)n];

        for(long i = 0; i < n; i++)
            arr[(int)i] = sc.nextLong();

        Solution1 ob = new Solution1();
        long ans[] = ob.sumAndProduct(arr, n);
        System.out.println(ans[0] + " " + ans[1]);
    }
  }
}

class Solution1{
    static long[] sumAndProduct(long arr[], long n){
        long max=Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max ){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        long sum=max+min;
        long product=max*min;

        long ans[]=new long[2];
        ans[0]=sum;
        ans[1]=product;


        return ans;
    }
}
