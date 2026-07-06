class Solution {
  public boolean hasDuplicate(int[] nums) {
    Map<Integer, Integer> mp = new HashMap<>();
    for(int x : nums){
      mp.put(x, mp.getOrDefault(x, 0)+1);
    }
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        if(entry.getValue()>1){
        return true;
      }
    }
    return false;
  }
}