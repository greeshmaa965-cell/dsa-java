///////////////////brute sol///////////
class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                int up =
                        (i > 0)
                        ? mat[i - 1][j]
                        : -1;

                int down =
                        (i < n - 1)
                        ? mat[i + 1][j]
                        : -1;

                int left =
                        (j > 0)
                        ? mat[i][j - 1]
                        : -1;

                int right =
                        (j < m - 1)
                        ? mat[i][j + 1]
                        : -1;

                if(mat[i][j] > up &&
                   mat[i][j] > down &&
                   mat[i][j] > left &&
                   mat[i][j] > right) {

                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
////////////////////optimal solution/////////////////
class Solution {

    public int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int maxRow = 0;

            for(int i = 0; i < n; i++) {

                if(mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int left =
                    (mid > 0)
                    ? mat[maxRow][mid - 1]
                    : -1;

            int right =
                    (mid < m - 1)
                    ? mat[maxRow][mid + 1]
                    : -1;

            if(mat[maxRow][mid] > left &&
               mat[maxRow][mid] > right) {

                return new int[]{maxRow, mid};
            }

            else if(left > mat[maxRow][mid]) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }
}
