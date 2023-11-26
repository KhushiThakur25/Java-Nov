import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 10, 10, 20, 5, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> mapEl : map.entrySet()) {
            System.out.println(mapEl.getKey() + "-" + mapEl.getValue());
        }
    }
}