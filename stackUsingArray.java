
import java.util.Stack;

public class stackUsingArray {

	int size;
	int stack [];
	int top;
		
	
	public stackUsingArray(int size) {
		
		this.size = size;
		this.stack = new int[size];
		this.top = -1;
		
	}
	
	public boolean isFull () {
		
		return (size-1 == top);
		
	}
	
	public boolean isEmpty () {
		
		return (top == -1);
		
	}

	public int push(int num) {
		
		if (isFull()) {
			System.out.println("Stack is full. Can not insert any more elements!");
		}	
		return stack [++top] = num;
	
	}
	
	public int pop () {
		
		if (isEmpty()) {
			System.out.println("Stack is empty therefore can not remove any elements!");
		}
		
		return stack[top--];
		
	}
	
	public int top () {
		
		return stack[top];
		
	}

	public int size () {
		
		return stack[size];
		
	}

	public static boolean balancer(String s) {
        
		Stack<Character> stack  = new Stack<Character>();
        
			 //count = 0;
		for(int i = 0; i < s.length(); i++) {
           
			char c = s.charAt(i);
           
			if(c == '(') {     
                stack.push(c);
            } 
                
             else if (c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                	return false;
                }           
             }       
            }
			
        
		return stack.isEmpty();
    
	}

	
	public static void main(String[] args) {
	
	//A4StackUsingArray stk = new A4StackUsingArray(30);
	
	System.out.println(balancer("()"));
	System.out.println(balancer("()()()()()()()"));
	System.out.println(balancer("((((((((())))))))"));
	System.out.println(balancer("(()((()()())(())))"));
	System.out.println(balancer(")("));
	System.out.println(balancer("((()()())))"));
	System.out.println(balancer("(((((((()))))))"));
	System.out.println(balancer("()()())()()()"));		
	System.out.println(balancer(" ( ( { } ] )"));
	
	

	}

	
	
	
	
}
