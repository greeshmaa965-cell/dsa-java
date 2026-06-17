//////////Brute solution/////////////
class Solution {

    public int rowWithMax1s(int[][] mat) {

        int maxCount = 0;
        int ans = -1;

        for(int i = 0; i < mat.length; i++) {

            int count = 0;

            for(int j = 0; j < mat[0].length; j++) {

                if(mat[i][j] == 1) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                ans = i;
            }
        }

        return ans;
    }
}
/////////////Better solution////////////
class Solution {

    public int rowWithMax1s(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int maxOnes = 0;
        int ans = -1;

        for(int i = 0; i < n; i++) {

            int low = 0;
            int high = m - 1;

            int firstOne = m;

            while(low <= high) {

                int mid = low + (high - low) / 2;

                if(mat[i][mid] == 1) {

                    firstOne = mid;
                    high = mid - 1;

                } else {

                    low = mid + 1;
                }
            }

            int ones = m - firstOne;

            if(ones > maxOnes) {

                maxOnes = ones;
                ans = i;
            }
        }

        return ans;
    }
}
//////////////optimal solution//////////////
class Solution {

    public int rowWithMax1s(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int row = 0;
        int col = m - 1;

        int ans = -1;

        while(row < n && col >= 0) {

            if(mat[row][col] == 1) {

                ans = row;
                col--;

            } else {

                row++;
            }
        }

        return ans;
    }
}
