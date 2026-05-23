class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String t = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] temp= t.toCharArray();
        char[] temp1= t.toCharArray();
        int j=0;
        for(int i=(t.length()-1);i>=0;i--){
            temp[i]=temp1[j];
            j++;
        }
        String result = new String(temp);
        return (result.equals(t));
    }
}
