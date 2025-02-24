package arraysExamples;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int arr[]={10,3,43,56,387,7486};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
