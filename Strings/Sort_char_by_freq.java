////////////////////brute solution//////////////
import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        StringBuilder ans = new StringBuilder();

        while (!map.isEmpty()) {

            char maxChar = 0;
            int maxFreq = 0;

            for (char ch : map.keySet()) {
                if (map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    maxChar = ch;
                }
            }

            for (int i = 0; i < maxFreq; i++)
                ans.append(maxChar);

            map.remove(maxChar);
        }

        return ans.toString();
    }
}
///////////////////optimal solution//////////////
import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        PriorityQueue<Character> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {

            char ch = pq.poll();

            for (int i = 0; i < map.get(ch); i++)
                ans.append(ch);
        }

        return ans.toString();
    }
                  }
