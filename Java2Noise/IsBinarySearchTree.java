package Java2Noise;

// How to check the given Binary Tree is Binary Search Tree (BST) or not?
public class IsBinarySearchTree {

	public boolean isBinarySearchTree(BstNode root) {

		if (root == null)
			return Boolean.TRUE;
		return isBstValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBstValid(BstNode root, Integer minValue, Integer maxValue) {

		if (root == null)
			return Boolean.TRUE;
		if (root.getData() >= minValue && root.getData() < maxValue
				&& isBstValid(root.getLeft(), minValue, root.getData())
				&& isBstValid(root.getRight(), root.getData(), maxValue)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void main(String a[]) {

		BstNode root = new BstNode(3);
		// left sub tree
		BstNode node_2 = new BstNode(2);
		root.setLeft(node_2);
		BstNode node_1 = new BstNode(1);
		node_2.setLeft(node_1);
		BstNode node_4 = new BstNode(4);
		node_2.setRight(node_4);
		// right sub tree
		BstNode node_6 = new BstNode(6);
		root.setRight(node_6);
		BstNode node_5 = new BstNode(5);
		node_6.setLeft(node_5);
		BstNode node_7 = new BstNode(7);
		node_6.setRight(node_7);

		IsBinarySearchTree ibsTree = new IsBinarySearchTree();
		System.out.println(ibsTree.isBinarySearchTree(root));
	}

}
