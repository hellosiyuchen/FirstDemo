import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int uniqueDeliveries(String[] deliveryAddresses, int capacity) {
        if(deliveryAddresses == null || capacity < 0) {
            throw new IllegalArgumentException("Input is not Valid");
        }

        if (deliveryAddresses.length == 0 || capacity == 0) {
            return 0;
        }

        Set<String> visitedAddress = new HashSet<String>();
        int idx = 0;
        while (capacity > 0 && idx < deliveryAddresses.length) {
            visitedAddress.add(deliveryAddresses[idx++]);
            capacity--;
        }
        return visitedAddress.size();
    }

    public static void main(String[] args) {
        String[] deliveryAddresses = new String[]{"3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl","3 Zed Pl"};
        System.out.println(new Solution().uniqueDeliveries(deliveryAddresses, 5));
    }
}
