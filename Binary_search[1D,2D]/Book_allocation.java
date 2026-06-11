///////////////////////////brute sol////////////////
class Solution {

    public int findPages(int[] arr, int m) {

        if(m > arr.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for(int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        for(int maxPages = low; maxPages <= high; maxPages++) {

            int students = 1;
            int pagesSum = 0;

            for(int pages : arr) {

                if(pagesSum + pages <= maxPages) {
                    pagesSum += pages;
                }
                else {
                    students++;
                    pagesSum = pages;
                }
            }

            if(students <= m) {
                return maxPages;
            }
        }

        return -1;
    }
}
  ////////////////////////////////optimal solution//////
////////////
class Solution {

    public int findPages(int[] arr, int m) {

        if(m > arr.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for(int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int students = 1;
            int pagesSum = 0;

            for(int pages : arr) {

                if(pagesSum + pages <= mid) {

                    pagesSum += pages;

                } else {

                    students++;
                    pagesSum = pages;
                }
            }

            if(students <= m) {

                ans = mid;
                high = mid - 1;   // try smaller answer

            } else {

                low = mid + 1;    // need more pages
            }
        }

        return ans;
    }
}
  
