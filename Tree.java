package DataStructure;

public class Tree {
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
	}

	//二叉树高度
	int height(TreeNode node) {
		if(node == null) {
			return 0;
		}
		int leftDeep = height(node.left);
		int rightDeep = height(node.right);
		return leftDeep > rightDeep ? leftDeep + 1 : rightDeep + 1;
	}

	//前序遍历
	void preOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	//后序遍历
	void inOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	//二叉树结点个数
	void nodeNum(TreeNode node) {
		if(node == null) {
			return 0;
		}
		int leftNum = 0;
		if(node.left != null) {
			leftNum = nodeNum(node.left);
		}
		int leftNum = 0;
		if(node.right != null) {
			right = nodeNum(node.right);
		}
		return leftNum + rightNum + 1;
	}
}