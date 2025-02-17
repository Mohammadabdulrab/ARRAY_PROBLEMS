package arraysExamples;

import java.util.Scanner;


class Solution2 {
    public void zeroMax(int n, int[] arr) {
        // write code here
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int max=arr[i];
                for(int j=i+1;j<n;j++){
                    if(arr[j]>max && arr[j]%2!=0){
                        max=arr[j];
                    }
                }
                arr[i]=max;
            }
            else{
                continue;
            }
        }
    }
}
public class ZeroMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution2 Obj = new Solution2();
        scn.close();
        Obj.zeroMax(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
