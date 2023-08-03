class Solution {
    public void backtrack(String s , int idx , HashMap<Character,String> map , StringBuilder sb , List<String> ans){
    if(idx==s.length()){
        ans.add(sb.toString());
        return;
    }
    String str = map.get(s.charAt(idx));
    for(int i=0;i<str.length();i++){ 
        sb.append(str.charAt(i)); 
        backtrack(s,idx+1,map,sb,ans); 
        sb.deleteCharAt(sb.length()-1); 
    }
}
public List<String> letterCombinations(String digits) {
    ArrayList<String> list = new ArrayList<>();
    if(digits.length()==0) return list;
    HashMap<Character,String> map = new HashMap<>();
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
    backtrack(digits,0,map,new StringBuilder(),list);
    return list;
}
}