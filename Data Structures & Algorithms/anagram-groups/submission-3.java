class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String ele: strs){
            String key = generateSignature(ele);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(ele);
        }
        return new ArrayList<>(map.values());
    }
    private String generateSignature(String s){
        int[] frequency = new int[26];
        for(int i = 0;i<s.length();i++){
            frequency[s.charAt(i) - 'a']++;
        }
        StringBuilder str  = new StringBuilder();
        for(int ele: frequency){
            str.append("$");
            str.append(ele);
        }
        return str.toString();
        
    }
}
