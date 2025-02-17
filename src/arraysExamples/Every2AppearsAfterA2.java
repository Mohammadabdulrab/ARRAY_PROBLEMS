package arraysExamples;


import java.util.*;

class Solution5 {
    public boolean next2(int n, int[] arr) {
        // write code here
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                if ((i > 0 && arr[i - 1] == 2) || (i < n - 1 && arr[i + 1] == 2)) {
                    continue;
                }
                return false;
            }
        }
        return true;

    }
}
public class Every2AppearsAfterA2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution5 Obj = new Solution5();
        scn.close();
        System.out.print(Obj.next2(n, arr));
    }
}
