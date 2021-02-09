package Java2Noise;

//Implement Binary Search Tree (BST) pre-order traversal (depth first).
public class BinarySearchTreeImpl5 {

	private BstNode root;

	public boolean isEmpty() {

		return (this.root == null);
	}

	public void insert(Integer data) {

		System.out.print("[input: " + data + "]");
		if (root == null) {
			this.root = new BstNode(data);
			System.out.println(" -> inserted: " + data);
			return;
		}

		insertNode(this.root, data);
		System.out.print(" -> inserted: " + data);
		System.out.println();
	}

	private BstNode insertNode(BstNode root, Integer data) {

		BstNode tmpNode = null;
		System.out.print(" ->" + root.getData());
		if (root.getData() >= data) {
			System.out.print(" [L]");
			if (root.getLeft() == null) {
				root.setLeft(new BstNode(data));
				return root.getLeft();
			} else {
				tmpNode = root.getLeft();
			}
		} else {
			System.out.print(" [R]");
			if (root.getRight() == null) {
				root.setRight(new BstNode(data));
				return root.getRight();
			} else {
				tmpNode = root.getRight();
			}
		}

		return insertNode(tmpNode, data);
	}

	public void preOrderTraversal() {
		doPreOrder(this.root);
	}

	private void doPreOrder(BstNode root) {

		if (root == null)
			return;
		System.out.print(root.getData() + " ");
		doPreOrder(root.getLeft());
		doPreOrder(root.getRight());
	}

	public static void main(String a[]) {

		BinarySearchTreeImpl5 bst = new BinarySearchTreeImpl5();
		bst.insert(8);
		bst.insert(10);
		bst.insert(14);
		bst.insert(3);
		bst.insert(6);
		bst.insert(7);
		bst.insert(1);
		bst.insert(4);
		bst.insert(13);
		System.out.println("\n-------------------");
		System.out.println("Pre Order Traversal");
		bst.preOrderTraversal();
	}

}
