class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> preSumMap = new HashMap<>();
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum==k){
                count++;
            }
            if(preSumMap.containsKey(sum-k)){
                count += preSumMap.get(sum-k);
            }
            preSumMap.put(sum,preSumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }

}