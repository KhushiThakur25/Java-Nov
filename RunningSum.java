public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {4,5,6,1,2,3};
        for(int i=0;i<arr.length-1;i++){
            arr[i+1] += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
