class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
       int c=0,sum=-1;
       for(int i: arr){
           if(map.containsKey(i)) map.put(i,map.get(i)+1);
           else map.put(i,1);   
       }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getKey()==e.getValue()) sum=e.getValue();       
       }
       return sum;
    }
}