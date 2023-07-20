class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<ast.length; i++){
            if(stack.isEmpty() || ast[i]>0){
                stack.push(ast[i]);
            }
            else{
                while(!stack.isEmpty()){
                    int top = stack.peek();
                    if(top<0){
                        stack.push(ast[i]);
                        break;
                    }
                    int modval = Math.abs(ast[i]);
                        if(modval==top){
                            stack.pop();
                            break;
                        }else if(modval<top){
                            break;
                        }else{
                            stack.pop();
                            if(stack.isEmpty()){
                                stack.push(ast[i]);
                                break;
                            }
                        }
                    
                }
            }
        }
        int len = stack.size();
        int ans[] = new int[len];
        for(int i=len-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}