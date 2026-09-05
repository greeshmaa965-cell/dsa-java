class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int hash = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '#') {
                hash++;
            }
            else if (hash > 0) {
                hash--;
            }
            else {
                sb1.append(s.charAt(i));
            }
        }

        hash = 0;

        for (int i = t.length() - 1; i >= 0; i--) {

            if (t.charAt(i) == '#') {
                hash++;
            }
            else if (hash > 0) {
                hash--;
            }
            else {
                sb2.append(t.charAt(i));
            }
        }

        return sb1.reverse().toString().equals(sb2.reverse().toString());
    }
}
