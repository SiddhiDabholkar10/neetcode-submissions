class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        if(nums.length == 0) return 0;
        Set <Integer> u_set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            u_set.add(nums[i]);
        }
        for(int x:u_set){
            //if immediate lesser element does not exist - start sequence
            if(!u_set.contains(x-1)){
                int count =1;
                int curr = x;
                while(u_set.contains(curr+1)){
                    curr++;
                    count++;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }
}
