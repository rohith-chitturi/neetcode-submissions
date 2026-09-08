class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        int n=s.length();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
