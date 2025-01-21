package arraysExamples;
import java.util.Scanner;
public class FindElementsGreaterThan35InGivenArray {
//    Array Problem 2
//    Write a program to count the elements in an array which are greater than 35.
//    Example 1
//    Input->  5
//             12 67 89 16 23
//    Output->2
public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;++i){
        arr[i] = sc.nextInt();
    }
    int ans=ArrayProblem2(n,arr);
    System.out.println(ans);
  }

  public static int ArrayProblem2(int n,int [] arr){
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]>35){
            count++;
        }
    }
    return count;
  }

}
