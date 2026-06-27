/////////////////brute solution/////////////////
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        String rotated = s;

        for (int i = 0; i < s.length(); i++) {

            rotated = rotated.substring(1) + rotated.charAt(0);

            if (rotated.equals(goal))
                return true;
        }

        return s.equals(goal);
    }
}
///////////////////optimal solution//////////////////
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
