class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char alphabet : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - alphabet) == 32){
                stack.pop();
            }else{
                stack.push(alphabet);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char alphabet : stack){
            sb.append(alphabet);
        }
        return sb.toString();
    }
}