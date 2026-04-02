// import java.util.*;

// class Solution {
//     public void setZeroes(int[][] matrix) 
//     {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         HashSet<Integer> rows = new HashSet<>();
//         HashSet<Integer> cols = new HashSet<>();

//         // Step 1: find all zeros
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if(matrix[i][j] == 0)
//                 {
//                     rows.add(i);
//                     cols.add(j);
//                 }
//             }
//         }

//         // Step 2: update matrix
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if(rows.contains(i) || cols.contains(j))
//                 {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
