class Solution {
    public List<Integer> nrows(int n){
        int res = 1;
        List<Integer> rows = new ArrayList<>();
        rows.add(res);
        for(int i=1;i<n;i++){
            res = res * (n-i);
            res = res/i;
            rows.add(res);
        }
        return rows;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            pascal.add(nrows(i));
        }
        return pascal;
    }
}