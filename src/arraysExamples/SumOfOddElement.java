package arraysExamples;

import java.io.*;
import java.util.*;
public class SumOfOddElement {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(read.readLine());
        int Arr[] = new int[N];
        String[] inp = read.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            Arr[i] = Integer.parseInt(inp[i]);
        }
        Solution3 ob = new Solution3();
        int ans = ob.OddSum(N, Arr);
        System.out.println(ans);

    }
}

class Solution3 {
    int OddSum(int N, int Arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            if(Arr[i]%2!=0){
                sum=sum+Arr[i];
            }
        }
        return sum;
    }
}
