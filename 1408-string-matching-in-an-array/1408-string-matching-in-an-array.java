class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        String sub;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    sub = words[j];
                    boolean found = sub.contains(word);
                    if (found) {
                        res.add(word);
                        break;
                    }
                   
                }
            }
        }
        return res;
    }
}