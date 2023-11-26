import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,5,5,5,4,5,5,7};
        int size = arr.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
            if(map.get(arr[i]) >= size){
                System.out.println("Majority element in an array :"+arr[i]);
            }
        }
    }
}
