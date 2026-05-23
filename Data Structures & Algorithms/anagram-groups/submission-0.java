class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean used[] = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (used[i])
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;
            for (int j = i + 1; j < strs.length; j++) {

                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(group);
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        char chars1[] = s.toCharArray();
        char chars2[] = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}