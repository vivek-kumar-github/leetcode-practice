class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //using sorting and two pointers
        char[] rArr = ransomNote.toCharArray();
        char[] mArr = magazine.toCharArray();
        Arrays.sort(rArr);
        Arrays.sort(mArr);
        int i = 0, j = 0;
        while (i < rArr.length && j < mArr.length) {
            if (rArr[i] == mArr[j]) {
                i++;
                j++;
            } else if (rArr[i] > mArr[j]) {
                j++;
            } else {
                return false;
            }
        }
        return i == rArr.length;
    }
}