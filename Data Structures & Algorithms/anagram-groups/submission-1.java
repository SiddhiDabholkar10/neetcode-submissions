class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            String dictKey = Arrays.toString(freq);
            ans.putIfAbsent(dictKey, new ArrayList<>());
            ans.get(dictKey).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
