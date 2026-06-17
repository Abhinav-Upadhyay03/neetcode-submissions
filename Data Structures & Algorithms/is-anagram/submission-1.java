class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(int i = 0; i< s.length(); i++){
            int index = (int)(s.charAt(i)) - 97;
            count[index]++;
        }
        for(int i = 0; i < t.length(); i++){
            int index = (int)(t.charAt(i)) - 97;
            if(count[index] <=0 ){
                return false;
            }
            count[index]--;
        }
        for(int ele: count){
            if(ele > 0){
                return false;
            }
        }
        return true;
    }
}
