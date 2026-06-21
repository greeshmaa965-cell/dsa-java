//////////////Brute solution////////////////
class Solution {

    public int median(int[][] matrix, int R, int C) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < R; i++) {

            for(int j = 0; j < C; j++) {

                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);

        return list.get((R * C) / 2);
    }
}
//////////////////////optimal solution/////////////////
class Solution {

    private int upperBound(int[] row, int target) {

        int low = 0;
        int high = row.length - 1;

        int ans = row.length;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(row[mid] > target) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }

    public int median(int[][] matrix, int R, int C) {

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < R; i++) {

            low = Math.min(low, matrix[i][0]);

            high = Math.max(high,
                    matrix[i][C - 1]);
        }

        int req = (R * C) / 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for(int i = 0; i < R; i++) {

                count += upperBound(matrix[i], mid);
            }

            if(count <= req) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return low;
    }
}
