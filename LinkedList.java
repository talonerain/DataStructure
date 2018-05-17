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
	int length() {
		int length = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	//新增结点，遍历找到尾结点，需要考虑链表为空情况
	void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
}