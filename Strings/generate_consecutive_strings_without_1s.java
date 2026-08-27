import java.util.*;

class Solution {

    public void generate(int n, String str, int prev) {

        // Base case
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // We can always add 0
        generate(n, str + "0", 0);

        // We can add 1 only if previous character is not 1
        if (prev == 0) {
            generate(n, str + "1", 1);
        }
    }

    public void generateBinaryStrings(int n) {
        generate(n, "", 0);
    }
}
