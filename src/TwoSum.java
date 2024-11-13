import java.util.HashMap;

public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> indexMap = new HashMap<>(); // To store the index of each number

    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i]; // Calculate the complement

        if (indexMap.containsKey(complement)) {
            return new int[]{indexMap.get(complement), i}; // Return indices in order
        }

        indexMap.put(nums[i], i); // Store the index of the current number
    }

    throw new IllegalArgumentException("No two sum solution"); // This should never be reached
}

public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);

    System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}
