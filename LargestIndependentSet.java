package Dynamic_Programming;

/*Given a Binary Tree, find size of the Largest Independent Set(LIS) in it. A subset of all tree nodes is an independent set if there is no edge between
any two nodes of the subset. Time Complexity: O(n) where n is the number of nodes in given Binary tree.
For example, consider the following binary tree. The largest independent set(LIS) is {10, 40, 60, 70, 80} and size of the LIS is 5.*/

public class LargestIndependentSet {

	static class node {
		int data, liss;
		node left, right;

		public node(int data) {
			this.data = data;
			this.liss = 0;
		}
	}

	public static void main(String[] args) {
		node root = new node(20);
		root.left = new node(8);
		root.left.left = new node(4);
		root.left.right = new node(12);
		root.left.right.left = new node(10);
		root.left.right.right = new node(14);
		root.right = new node(22);
		root.right.right = new node(25);
		System.out.println("Size of the Largest Independent Set is " + liss(root)); //Size of the Largest Independent Set is 5
	}

	static int liss(node root) {
		if (root == null)
			return 0;
		if (root.liss != 0)
			return root.liss;
		if (root.left == null && root.right == null)
			return root.liss = 1;
		int liss_excl = liss(root.left) + liss(root.right);
		int liss_incl = 1;
		if (root.left != null) {
			liss_incl += (liss(root.left.left) + liss(root.left.right));
		}
		if (root.right != null) {
			liss_incl += (liss(root.right.left) + liss(root.right.right));
		}
		return root.liss = Math.max(liss_excl, liss_incl);
	}
}
