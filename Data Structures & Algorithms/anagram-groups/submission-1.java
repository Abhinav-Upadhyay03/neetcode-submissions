class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String ele: strs){
            char[] temp = ele.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            ArrayList<String> list = map.getOrDefault(sorted, new ArrayList<String>());
            list.add(ele);
            map.put(sorted, list);   
        }
        for(List<String> val: map.values()){
            res.add(val);
        }
        return res;

    }
}
