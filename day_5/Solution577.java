class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for(String rev : words) {
            StringBuilder temp = new StringBuilder(rev);
            res.append(temp.reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
}
