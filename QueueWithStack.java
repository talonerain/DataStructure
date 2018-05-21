package DataStructure;

/*通过两个栈实现队列，思路是利用栈后进先出的机制，
先后对两个栈入栈出栈，即可做到先进先出*/
public class QueueWithStack {
	private static Stack<Object> stack1 = new Stack<>();
	private static Stack<Object> stack2 = new Stack<>();

	public static void enQueue(Object item) {
		stack1.push(item);
	}

	/*检查栈2是否为空，若不为空，则弹出栈顶元素，若为空则先将栈1元素
	压入栈2，再弹出栈2栈顶元素，第一次调用时栈2为空，以后就不会为空了，
	因为已经压入了*/
	public Object void deQueue() {
		if(stack2.empty()) {
			if(stack1.empty()) {
				return null;
			} 
			while(!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		stack2.pop();
	}
}