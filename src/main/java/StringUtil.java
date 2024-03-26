public class StringUtil {
    MyString ms;

    public StringUtil(MyString ms){
        this.ms = ms;
    }
    public String replace(String s, String s1, String s2) {
        if (s == null || s1 == null || s2 == null) {
            return null;
        } else if (s1.equals("")) {
            return s;
        } else {
            StringBuilder returnString = new StringBuilder();
            //sIndex is pointer where we are traversing string s
            int sIndex = 0;
            //find index where the first s1 is in s
            int indexs1 = ms.indexOfString(s, s1, 0);
            //while there are still strings of s1 in s
            while (indexs1 != -1) {
                //add characters between elements of s1
                for (int i = sIndex; i < indexs1; i++) {
                    returnString.append(s.charAt(i));
                }
                //add the string to replace s1 with
                returnString.append(s2);
                sIndex = indexs1 + 1;
                //find next string s1 in s
                indexs1 = ms.indexOfString(s, s1, sIndex);
            }
            for (int i = sIndex; i < s.length(); i++) {
                returnString.append(s.charAt(i));
            }
            return returnString.toString();
        }
    }
}
