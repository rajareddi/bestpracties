package geeksforgeeks;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class ArrayToBinaryTree {

	public static void main(String[] args) {

		Node root;
		ArrayToBinaryTree tree = new ArrayToBinaryTree();
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		root = tree.sortedArrayToBST(arr, 0, n - 1);
		System.out.println("Preorder traversal of constructed BST");
		tree.preOrder(root);

	}

	Node sortedArrayToBST(int arr[], int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		int midvalue = arr[mid];
		Node node1 = new Node(midvalue);
		node1.left = sortedArrayToBST(arr, start, mid-1);
		node1.right = sortedArrayToBST(arr, mid + 1, end);
		return node1;

	}

	void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
}
