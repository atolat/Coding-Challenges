import java.util.Stack;
public class app {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> minStack = new Stack<>();
		
		
		
	}
	void push (int data, Stack<Integer> stack, Stack<Integer> minStack){
		if(stack.isEmpty()){
			stack.push(data);
			minStack.push(data);
		}else{
			if(data<minStack.peek()){
				stack.push(data);
				minStack.push(data);
			}else{
				stack.push(data);
				minStack.push(minStack.peek());
			}
		}
		
	}
	
	void pop(Stack<Integer> stack, Stack<Integer> minStack){
		stack.pop();
		minStack.pop();
	}
	
	Integer findMin(Stack<Integer> minStack){
		return minStack.peek();
	}
}
