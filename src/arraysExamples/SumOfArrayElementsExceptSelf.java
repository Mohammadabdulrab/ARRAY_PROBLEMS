package arraysExamples;

import java.util.Scanner;
public class SumOfArrayElementsExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }

    public static int [] SumArrayExpectSelf(int [] nums, int n){

      int [] sum=new int[n];
      for (int i=0;i<n;i++){
          int sum1=0;
          for(int j=0;j<n;j++){
              sum1=sum1+nums[j];
          }
          sum[i]=sum1-nums[i];
      }
      return sum;
    }
}
