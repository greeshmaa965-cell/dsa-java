///////////////brute solution////////////
class Solution {

    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = getValue(s.charAt(i));

            if (i < s.length() - 1 && curr < getValue(s.charAt(i + 1)))
                ans -= curr;
            else
                ans += curr;
        }

        return ans;
    }

    public int getValue(char ch) {

        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        return 0;
    }
}
///////////////optimal solution////////////////
import java.util.*;

class Solution {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = map.get(s.charAt(i));

            if (i < s.length() - 1 && curr < map.get(s.charAt(i + 1)))
                ans -= curr;
            else
                ans += curr;
        }

        return ans;
    }
}
