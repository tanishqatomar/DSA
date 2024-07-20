class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        for(String currentPath : paths){
            if(currentPath.equals(".") || currentPath.trim().length() == 0){
                continue;   //skips the current iteration
            }
            else if(currentPath.equals("..")){   //level up
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(currentPath);
            }
        }
        //convert stack path into cononical path
        StringBuilder canonicalPath = new StringBuilder();   //by default begins with a '/'
        for(String cpath : stack){
            canonicalPath.append("/");
            canonicalPath.append(cpath);
        }
        return canonicalPath.toString().length() > 0 ? canonicalPath.toString() : "/";
    }
}