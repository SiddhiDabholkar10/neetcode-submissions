class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int dip_index = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                dip_index = i;
                break;
            }
        }
        
        if(dip_index!=-1){
           for(int i = n-1;i>dip_index;i--){
            if(nums[i]>nums[dip_index]){
                int temp = nums[i];
                nums[i] = nums[dip_index];
                nums[dip_index] = temp;
                break;
            }
        }
        }
        reverse(nums,dip_index+1,n-1);
        
    }
}