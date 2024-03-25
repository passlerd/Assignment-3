public class MyString {
    public int indexOfString(String s1, String s2, int pos) {
        if (s1 != null && !s1.equals("") && s2 != null && !s2.equals("")) {
            //create two pointers: i in s1 and j in s2, and move j pointer along s2 if the string so far matches s1
            int j = 0;
            int startIndex = -1;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    //if startIndex is -1, it is the beginning of the potential matching substring in s1
                    if (startIndex == -1 && i >= pos && j == 0) {
                        startIndex = i;
                    }
                    if (j == s2.length() - 1 && startIndex >= pos) {
                        return startIndex;
                    }
                    //do not increase the pointer for s2 beyond the length of s2
                    if (j < s2.length() - 1) {
                        j++;
                    }
                } else {
                    startIndex = -1;
                    j = 0;
                }
            }
            //if we have traversed all of s1 and s2 pointer has not moved to end of s2, s2 is not in s1
            if (j != s2.length()) {
                return -1;
            }
        }
        return -1;
    }

    public String replace(String s, String s1, String s2) {
        if (s == null || s1==null || s2==null){
            return null;
        } else if (s1.equals("")){
            return s;
        }
        return "";
    }
}