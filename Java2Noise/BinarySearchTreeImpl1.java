package Java2Noise;

//Find min and max value from Binary Search Tree (BST)
public class BinarySearchTreeImpl1 {

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

	public Integer findMinValue() {

		return minValue(this.root);
	}

	public Integer findMaxValue() {

		return maxValue(this.root);
	}

	private Integer minValue(BstNode node) {

		if (node.getLeft() != null) {
			return minValue(node.getLeft());
		}
		return node.getData();
	}

	private Integer maxValue(BstNode node) {

		if (node.getRight() != null) {
			return maxValue(node.getRight());
		}
		return node.getData();
	}

	public static void main(String a[]) {

		BinarySearchTreeImpl1 bst = new BinarySearchTreeImpl1();
		bst.insert(10);
		bst.insert(20);
		bst.insert(21);
		bst.insert(8);
		bst.insert(6);
		bst.insert(16);
		bst.insert(23);
		bst.insert(2);
		System.out.println("-------------------");
		System.out.println("Min value: " + bst.findMinValue());
		System.out.println("Max value: " + bst.findMaxValue());
	}

}
