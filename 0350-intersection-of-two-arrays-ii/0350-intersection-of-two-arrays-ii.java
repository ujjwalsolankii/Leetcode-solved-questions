class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1= new HashMap<>();
        HashMap<Integer, Integer> map2= new HashMap<>();
        for(int num : nums1){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey())){
                int copies = Math.min(entry.getValue(), map2.get(entry.getKey()));
                while(copies-->0){
                    res.add(entry.getKey());
                }
            }
        }
        int[] ans= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans; 
    }
}