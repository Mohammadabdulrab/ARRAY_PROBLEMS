package arraysExamples;

import java.util.Scanner;
public class ShortestDistanceBetweenEvenNumbers {
//    Array Problem 6
//    Write a program to find out the shortest distance between two even
//    positive integers in an array arr and print the distance.
//    If there is one or zero even positive integer in the array then return -1.
//
//    Note that if the index of one even positive integer is i and the index of
//    another even positive integer is j then their distance will be |i-j|.
//    input-> 5
//            2 4 1 6 7
//    output-> 1
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n,int [] arr){
        int shortestdistance=Integer.MAX_VALUE;
        int count=0;
        int distance=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>0 && arr[i]%2==0){
                count++;
                for(int j=i+1;j<n;j++){
                    if(arr[j]%2==0 && arr[j]>0) {
                        count++;
                        distance = j - i;

                        if (shortestdistance > distance) {
                            shortestdistance = distance;
                        }
                    }
                }
            }
        }
        if(count<2){
            return -1;
        }
        return shortestdistance;
    }
}
