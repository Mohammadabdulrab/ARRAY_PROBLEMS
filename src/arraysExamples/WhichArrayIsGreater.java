package arraysExamples;
import java.util.Scanner;
public class WhichArrayIsGreater {
//    Array Problem 4
//    Write a program to find out the difference between sum of all the elements in two arrays arr1 and arr2.
//    If sum of all elements in arr1 is larger then, the output should be First array is larger,
//            if sum of all elements in arr2 is larger then, the output should be Second array is larger,
//    otherwise the output should be Both are equal.
//    example 1
//    input->2
//            1 2
//            2
//            3 4
//    output->second array is greater
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
            arrA[i]=sc.nextInt();
        }

        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }

        System.out.println(ArrayProblem(arrA,arrB));
    }

    public static String ArrayProblem(int [] arrA,int [] arrB){
        int sum_of_arrA=0;
        int sum_of_arrB=0;
        String s;
        for(int i=0;i<arrA.length;i++){
            sum_of_arrA=sum_of_arrA+arrA[i];
        }
        for(int i=0;i<arrB.length;i++){
            sum_of_arrB=sum_of_arrB+arrB[i];
        }
        if(sum_of_arrA>sum_of_arrB){
             s="First array is larger";
        }
       else if(sum_of_arrA<sum_of_arrB){
           s="Second array is larger";
        }
       else{
            s="Both are equal";
        }
        return s;
    }

}
