class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=matrix[0][0];
        int cl = matrix[0].length;
        int rl = matrix.length;
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }
                    else {
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<rl;i++){
            for(int j=1;j<cl;j++){
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j=0;j<cl;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0==0){
            for(int i=0;i<rl;i++){
                matrix[i][0] = 0;
            }
        }
    }
}
