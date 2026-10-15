class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] s_count = new int [26];
        int [] t_count = new int [26];

        for(int i = 0; i < s.length(); i++){
            s_count[s.charAt(i) - 'a']++;
            t_count[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s_count.length; i++){
            if(s_count[i] != t_count[i]){
                return false;
            }
        }
        return true;
    }
}
