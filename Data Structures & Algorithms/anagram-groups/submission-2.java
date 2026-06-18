class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String ele: strs){
            char[] temp = ele.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(ele);
        }
        return new ArrayList<>(map.values());

    }
}
