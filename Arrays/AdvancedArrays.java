package Arrays;

public class AdvancedArrays {
 
    // 1. Prefix  fdgdfs
    public static void prefixSumExample() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
      
        int l = 1, r = 3;
        int sum = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        System.out.println("Prefix Sum [1..3] = " + sum); 
    }

    // 2. Sliding Window

    public static void slidingWindowExample() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += arr[i];
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println("Max sum of window size " + k + " = " + maxSum); 
    }

    // 3. Two Pointers
    public static void twoPointersExample() {
        int[] arr = {1, 2, 4, 7, 10};
        int x = 9;
        int l = 0, r = arr.length - 1;
        boolean found = false;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == x) {
                System.out.println("Pair Found: " + arr[l] + " + " + arr[r]);
                found = true;
                break;
            } else if (sum < x) l++;
            else r--;
        }
        if (!found) System.out.println("No pair found");
    }

    // 4. Kadane’s Algorithm
    public static void kadaneExample() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSum = Math.max(maxSum, curr);
        }
        System.out.println("Max subarray sum = " + maxSum); // 6
    }

    // 5. Dutch National Flag
    public static void dutchFlagExample() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int tmp = arr[low]; arr[low] = arr[mid]; arr[mid] = tmp;
                low++; mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int tmp = arr[mid]; arr[mid] = arr[high]; arr[high] = tmp;
                high--;
            }
        }
        System.out.print("Dutch Flag Sorted: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    // 6. Moore’s Voting Algorithm
    public static void mooreVotingExample() {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println("Majority Element = " + candidate); 
    }

    // 7. XOR Trick
    
    public static void xorExample() {
        int[] arr = {1, 2, 3, 2, 1};
        int xor = 0;
        for (int num : arr) xor ^= num;
        System.out.println("Unique Element = " + xor); 
    }

    public static void main(String[] args) {
        prefixSumExample();
        slidingWindowExample();
        twoPointersExample();
        kadaneExample();
        dutchFlagExample();
        mooreVotingExample();
        xorExample();
    }
}
