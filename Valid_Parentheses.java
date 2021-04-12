import java.util.*;
public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String s) {
            HashMap<Character,Character> maps=new HashMap<Character,Character>();
            maps.put(')','(');
            maps.put(']','[');
            maps.put('}','{');
            Stack<Character> stack=new Stack<Character>();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(maps.containsKey(c)){
                    if(stack.empty()||stack.pop()!=maps.get(c))return false;
                }
                else
                    stack.push(c);
            }
            return stack.empty();
        }
    }  
}
