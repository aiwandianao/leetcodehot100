import java.util.HashSet;
import java.util.Set;

public class leetcode {

    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            int cnt = 0;
            int tmp = i;
            if (!set.contains(i - 1)) {
                while (set.contains(tmp)) {
                    tmp++;
                    cnt++;
                }
                ans = Math.max(cnt, ans);
            }
        }
        return ans;
    }

}



