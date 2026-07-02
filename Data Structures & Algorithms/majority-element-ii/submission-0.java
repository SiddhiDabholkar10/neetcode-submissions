class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;int cnt2=0;
        int e1= Integer.MIN_VALUE;
        int e2= Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && e2!=nums[i]){
                cnt1++;
                e1 = nums[i];
            }
            else if(cnt2==0 && e1!=nums[i]){
                cnt2++;
                e2=nums[i];
            }
            else if(e1==nums[i]){
                cnt1++;
            }
            else if(e2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == e1) cnt1++; 
            if (nums[i] == e2) cnt2++;
        }
        List<Integer> res = new ArrayList<>();
        if(cnt1>n/3){
            res.add(e1);
        }
        if(cnt2>n/3){
            res.add(e2);
        }
        Collections.sort(res);
        return res;
        
    }
}