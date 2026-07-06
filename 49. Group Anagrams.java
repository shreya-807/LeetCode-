//49. Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedstr = String.valueOf(charArr);

            if (!groupAnagrams.containsKey(sortedstr)) {
                groupAnagrams.put(sortedstr, new ArrayList<>());
            }
            groupAnagrams.get(sortedstr).add(str);
        }
        return new ArrayList<>(groupAnagrams.values());

    }
}
