/////////////////brute solution////////////////
class Solution {
    public String largestOddNumber(String num) {

        String ans = "";

        for(int i = 0; i < num.length(); i++) {
            for(int j = i; j < num.length(); j++) {

                String sub = num.substring(i, j + 1);

                int lastDigit = sub.charAt(sub.length() - 1) - '0';

                if(lastDigit % 2 == 1) {
                    if(sub.length() > ans.length())
                        ans = sub;
                }
            }
        }
        return ans;
    }
}
///////////////////////////optimal solution////////////////////
class Solution {
    public String largestOddNumber(String num) {

        for(int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if(digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
