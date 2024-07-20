class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first = remainingString(s);
        String second = remainingString(t);
        return first.equals(second);
    }
    String remainingString (String str){
        StringBuilder stack = new StringBuilder();
        for(char singleChar : str.toCharArray()){
            if(singleChar != '#')
                stack.append(singleChar);
            else if(stack.length() > 0)
                stack.deleteCharAt(stack.length() - 1);
        }
        return stack.toString();
    }
}