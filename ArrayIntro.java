import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] arr1 = new int[5];
        int[] arr2 = { 2, 3, 5, 6, 8, 9 };
        Scanner sc = new Scanner(System.in);
        int num = 9;
        boolean flag = true;
        int index = 2;
        for(int i = index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.println("enter the value for an array..");
        //     arr1[i] = sc.nextInt();
        // }
        // for(int i=0;i<arr2.length;i++){
        //     if(arr2[i] == num)
        //     {
        //         flag = true;
        //     break;
        //     }
        //     else
        //     {
        //         flag = false;
        //     }
        // }
        // if(flag){
        //     System.out.println("num is present..");
        // }
        // else{
        //     System.out.println("num is not present..");
        // }

    }

}
