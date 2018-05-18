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

	//删除结点，需要考虑容错
	void deletaNode(int index) {
		if(index < 1 || index > length()) {
			System.out.println("index error!");
		}
		if(index == 1) {
			head = head.next;
			return;
		}
		int i = 2;
		//因为要删除当前结点，所以必须用preNode，而不使用nextNode，
		//所以遍历是从第二个结点开始，这样要对头结点进行特殊处理
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode != null) {
			if(i = index) {
				preNode.next = curNode.next;
				return;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
	}
}