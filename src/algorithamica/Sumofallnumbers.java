package algorithamica;

public class Sumofallnumbers {

	static Node root, prev;

	public static void main(String[] args) {
		Sumofallnumbers tree = new Sumofallnumbers();
		tree.root = tree.new Node(6);
		tree.root.left = tree.new Node(3);
		tree.root.right = tree.new Node(5);
		tree.root.right.right = tree.new Node(4);
		tree.root.left.left = tree.new Node(2);
		tree.root.left.right = tree.new Node(5);
		tree.root.left.right.right = tree.new Node(4);
		tree.root.left.right.left = tree.new Node(7);
		System.out.print("Sum of all paths is " + tree.treePathsSum(root));
	}

	private int treePathsSum(Node root) {
		return treePathsSumUtil(root, 0);
	}

	private int treePathsSumUtil(Node node, int val) {

		// Base case
		if (node == null) {
			return 0;
		}
		// Update val
		val = (val * 10 + node.data);

		if (node.left == null && node.right == null) {
			return val;
		}
		return treePathsSumUtil(node.left, val)
				+ treePathsSumUtil(node.right, val);
	}

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

}
