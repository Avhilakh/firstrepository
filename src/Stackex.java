import java.util.Stack;

public class Stackex {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(2);
		stk.push(6);
		stk.push(8);
		stk.push(1);
		stk.push(9);
		while(stk.pop()!=1) {
			int x = stk.pop();
			System.out.println(x);
		}
	}

}
