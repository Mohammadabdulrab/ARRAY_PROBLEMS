package arraysExamples;

import java.util.Scanner;
public class LargestNumberAtLeastTwiceOfOther {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
    }
}
    class Solution {
        public int LargestElement(int[] nums, int n) {
            int mx = Integer.MIN_VALUE;
            int mxi = -1;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > mx) {
                    mx = nums[i];
                    mxi = i;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i == mxi) {
                    continue;
                }
                if (mx >= 2 * nums[i]) {
                    count++;
                }
            }
            if (count == n - 1) {
                return mxi;
            } else {
                return -1;
            }
        }
    }

