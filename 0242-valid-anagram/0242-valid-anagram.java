class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] numbers = new int[26];
        for(int i=0;i<s.length();i++){
            numbers[s.charAt(i)-'a']++;
            numbers[t.charAt(i)-'a']--;
        }
        for(int j : numbers){
            if(j!=0){
                return false;
            }
        }
        return true;
    }
}