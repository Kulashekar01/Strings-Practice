class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String s1 = "";
        for(int i = s.length()-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        return s.equals(s1);
    }
}
