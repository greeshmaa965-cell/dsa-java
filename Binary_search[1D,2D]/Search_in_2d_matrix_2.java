//////////////brute solution//////////////
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
///////////////////////////optimal solution///////////////
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0) {

            if(matrix[row][col] == target) {

                return true;

            } else if(matrix[row][col] > target) {

                col--;

            } else {

                row++;
            }
        }

        return false;
    }
}
