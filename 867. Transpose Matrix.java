//867. Transpose Matrix
//transpose is to interchange rows and column 
//means the elements in row must be in column in traanspose and similarly, column elements must be row element.
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][rows];
        int i, j;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
