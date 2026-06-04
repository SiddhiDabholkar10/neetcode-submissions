class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countHash = new HashMap<>();
        for (int num: nums){
            countHash.put(num,countHash.getOrDefault(num,0)+1);
        }
        for(int key:countHash.keySet()){
            if(countHash.get(key)>1){
                return true;
            }
        }
        return false;

    }
}