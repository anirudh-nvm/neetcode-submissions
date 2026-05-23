class Solution {
    public boolean isAnagram(String s, String t) {
        int count=0;
        char chars[]=s.toCharArray();
        Arrays.sort(chars);
        char chars2[]=t.toCharArray();
        Arrays.sort(chars2);
        return(Arrays.equals(chars, chars2));
}
}
