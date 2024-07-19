class Solution {
    public boolean isValid(String s) {
        //maintain hashMap for bracket pairs
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(',')');
        pairs.put('{','}');
        pairs.put('[',']');
        
        //maintian stack for opening brackets
        Stack<Character> stack = new Stack<>();
        char brackets[] = s.toCharArray();
        for(char bracket : brackets){
            if(pairs.containsKey(bracket))
                stack.push(bracket);
            else{
                if(stack.isEmpty())
                    return false;
                char openingBracket = stack.pop();
                char closingBracket = pairs.get(openingBracket);
                if(closingBracket != bracket)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}