class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int start = 0;
        int maxF = 0;
        int[] freq = new int[26];
        for(int end=0; end<s.length() ;end++){
            int ch = s.charAt(end) - 'A';
            freq[ch]++;
            maxF = Math.max(freq[ch], maxF);
            if((end-start+1)-maxF > k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);

        }
        return maxLen;
    }
}
