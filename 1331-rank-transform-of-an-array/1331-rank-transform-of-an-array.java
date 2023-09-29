class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copyArr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copyArr);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=0,prev=Integer.MIN_VALUE;
        for(int n:copyArr)
           map.putIfAbsent(n,map.size()+1);
        for(int i=0;i<arr.length;i++)
            arr[i]=map.get(arr[i]);
        return arr;
    }
}