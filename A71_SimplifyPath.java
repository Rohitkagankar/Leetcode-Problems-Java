import java.util.Stack;

public class A71_SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }
        
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }
        
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }
    public static void main(String[] args) {
        A71_SimplifyPath sol=new A71_SimplifyPath();
        String path="./home//out/";
        System.out.println(sol.simplifyPath(path));
    }
}
