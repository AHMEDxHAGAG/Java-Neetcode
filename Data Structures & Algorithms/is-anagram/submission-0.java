class Solution {
    public boolean isAnagram(String s, String t) {

        s = sortString(s);
        t = sortString(t);
        return s.hashCode() == t.hashCode() ? true : false;
    }

    public String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}