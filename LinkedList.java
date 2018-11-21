package DataStructure;

public class LinkedList {
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}

	Node head = null;

	//链表长度，遍历结点计数
	public int length() {
		int length = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	//新增结点，遍历找到尾结点，需要考虑链表为空情况
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	//删除结点，需要考虑容错
	public boolean deleteNode(int index) {
		if(index < 1 || index > length()) {
			System.out.println("index error!");
			return false;
		}
		if(index == 1) {
			head = head.next;
			return true;
		}
		int i = 2;
		/*因为要删除当前结点，所以必须用preNode，而不使用nextNode，
		所以遍历是从第二个结点开始，这样要对头结点进行特殊处理*/
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode != null) {
			if(i = index) {
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return true;
	}

	/*删除重复元素，使用两层遍历，内层遍历从外层遍历的当前结点
	下一个结点开始，即q.next*/
	public void deleteDup() {
		Node p = head;
		while(p != null) {
			Node q = p;
			while(q.next != null) {
				if(p.data == q.next.data) {
					q.next = q.next.next;
				} else {
					q = q.next;
				}
			}
			p = p.next;
		}
	}

	/*链表反转（逆置），思路是从头到尾遍历，依次改变next结点,
	需要一个临时结点保存下一个结点*/
	void reverse() {
		Node preNode = head;
		curNode = head.next;
		Node tmpNode;
		while(curNode != null) {
			tmpNode = curNode.next;
			curNode.next = preNode;	//使后一个指向前一个
			//继续向后遍历
			preNode = curNode;
			curNode = tmpNode;
		}
	}

	//判断是否回文结构
	void boolean isHuiWen() {
		if(head == null) {
			return false;
		}
		Stack<Node> stack = new Stack<>();
		Node curNode = head;
		while(curNode != null) {
			stack.push(curNode);
			curNode = curNode.next;
		}
		while(head.next != null) {
			if(head.data != stack.pop().data) {
				return false;
			}
			head = head.next;
		}
		return true;
	}
}