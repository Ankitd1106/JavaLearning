import java.util.HashSet;
import java.util.Set;

public static boolean hasDup(int[] num) {
    Set<Integer> dup = new HashSet<>();

    for (int n : num) {
        if (!dup.add(n)) {
            return true;
        }
    }

    return false;
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    System.out.println( hasDup(nums));
}
