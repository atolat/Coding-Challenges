import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class app {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		HashMap<Character,Character> parenMap=new HashMap<>();
		Set<Character> parenSet=new HashSet<>();
		parenMap.put(')', '(');
		parenMap.put('}', '{');
		parenMap.put(']', '[');
		parenSet.add('(');
		parenSet.add('{');
		parenSet.add('[');
		String s = ("(abc){def}[xyz(lmn)]");
		
		for(int i=0;i<s.length();i++){
			Character ch = s.charAt(i);
			if(parenSet.contains(ch)){
				stack.push(ch);
			}
			if(parenMap.containsKey(ch)){
				Character closing = stack.pop();
				if(closing!=parenMap.get(ch)){
					System.out.println("Not Well Formed!!");
				}
			}
		}
		if(stack.isEmpty()){
			System.out.println("Well Formed!!");
		}else{
			System.out.println("Not Well Formed!!");
		}
	}
}
