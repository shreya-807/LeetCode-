class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
        }
       
        int size = list.size();
         k = k % size;
        int p = size - k;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = list.get(p % size);
                p++;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                currentRow.add(grid[i][j]);
            }
            res.add(currentRow);
        }
        return res;
    }
}