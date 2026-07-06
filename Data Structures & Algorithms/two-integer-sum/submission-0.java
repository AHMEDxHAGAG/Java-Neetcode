

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = { 0, 0 };
        for (int x : nums) {
            int val = mp.getOrDefault(x,0);
            mp.put(x, val + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int secV = (target - curr);
            Integer secF = mp.get(secV);
            if (secF == null)
                continue;
            if (secF < 2 && secV == curr)
                continue;
            arr[0] = i;
            boolean bad = true;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j]+curr==target) {
                    arr[1] = j;
                    bad = false;
                    break;
                }
            }
            if (bad) {
                continue;
            }
            break;
        }
        return arr;
    }
}