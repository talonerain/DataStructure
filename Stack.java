package DataStructure;

public class Stack {
	private int top;	//栈顶指针
	private int[] data;	//数组存储数据
	private int maxSize;	//数组大小，即栈最大容量，并不是栈大小，栈大小是指当前栈元素个数

	public Stack(int size) {
		top = -1;
		this.maxSize = size;
		data = new int[maxSize];
	}

	public boolean isEmpty() {
		return （top == -1）;
	}

	public boolean isFull() {
		//指针从0开始，所以maxSize-1
		return (top == maxSize - 1);
	}

	public void push(int e) {
		if(isFull) {
			return;
		}
		data[++top] = e;
	}

	public int pop() {
		if(isEmpty) {
			return -1;
		}
		return data[top--];
	}
}