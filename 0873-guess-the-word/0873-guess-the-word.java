/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {
        //brute force
        List<String> list = new ArrayList<>(Arrays.asList(words));
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String word = list.get(random.nextInt(list.size()));
            int matches = master.guess(word);
            if (matches == 6) {
                return;
            }
            List<String> candidates = new ArrayList<>();
            for (String a : list) {
                if (getMatches(a, word) == matches) {
                    candidates.add(a);
                }
            }
            list = candidates;
        }
    }
    public int getMatches(String a, String b) {
        int n = 0;
        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                n++;
            }
        }
        return n;
    }
}