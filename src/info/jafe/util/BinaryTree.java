package info.jafe.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree<E extends Comparable<E>> implements AbstractTree<E> {
	static class TreeNode<E extends Comparable<E>> {
		protected E item;
		protected TreeNode<E> left;
		protected TreeNode<E> parent;
		protected TreeNode<E> right;

		public TreeNode(E item) {
			this.item = item;
		}
	}
	private TreeNode<E> root = null;

	private int size = 0;

	@Override
	public boolean add(E e) {
		return insert(e);
	}

	@Override
	public void breadthorder() {
		LinkedList<TreeNode<E>> list = new LinkedList<>();
		TreeNode<E> current = root;
		list.add(current);
		int index = 0;
		while (index < getSize()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					TreeNode<E> temp = list.get(i);
					System.out.print(temp.item + " ");
					list.add(i, temp.left);
					list.add(i + 1, temp.right);
					list.remove(temp);
					index++;
					i++;
				}
			}
		}
	}

	@Override
	public void clear() {
		clearPreorder(root);
		size = 0;
	}

	private void clearPreorder(TreeNode<E> root) {
		root.parent = null;
		root.item = null;
		clearPreorder(root.left);
		clearPreorder(root.right);
	}

	// ����Ҷ�ӽڵ�ĸ���
	public int getNumberOfLeaves() {
		return getNumberOfLeaves(root);
	}

	private int getNumberOfLeaves(TreeNode<E> root) {
		if (root == null) {
			return 0;
		} else if (root.right == null && root.left == null) {
			return 1;
		} else {
			return getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
		}
	}

	// ���ط�Ҷ�ӽڵ�ĸ���
	public int getNumberOfNonLeaves() {
		return getSize() - getNumberOfLeaves();
	}

	// ����ָ��Ԫ�صĸ��ڵ�
	public TreeNode<E> getParent(E e) {
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.item) < 0) {
				current = current.left;
			} else if (e.compareTo(current.item) > 0) {
				current = current.right;
			} else {
				return current.parent;
			}
		}
		return null;
	}

	// ���ظ��ڵ�
	public TreeNode<E> getRoot() {
		return root;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean had(E e) {
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.item) < 0) {
				current = current.left;
			} else if (e.compareTo(current.item) > 0) {
				current = current.right;
			} else {
				return true;
			}
		}
		return false;
	}

	// ���ض������ĸ߶�
	public int height() {
		int len = 0;
		ArrayList<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> current = root;
		list.add(current);
		int index = 0;
		while (index < getSize()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					TreeNode<E> temp = list.get(i);
					list.add(i, temp.left);
					list.add(i + 1, temp.right);
					list.remove(temp);
					index++;
					i++;
				}
			}
			len++;
		}
		return len;
	}

	@Override
	public void inorder() {
		inorder(root);
	}

	private void inorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.item + " ");
		inorder(root.right);
	}

	@Override
	public void inorderNR() {
		Stack<TreeNode<E>> stack = new Stack<>();
		TreeNode<E> c = root;
		while (!stack.isEmpty() || c != null) {
			while (c != null) {
				stack.push(c);
				c = c.left;
			}
			c = stack.pop();
			System.out.print(c.item + " ");
			c = c.right;
		}
	}

	@Override
	public boolean insert(E e) {
		if (root == null) {
			root = new TreeNode<E>(e);
			size++;
		} else {
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.item) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.item) > 0) {
					parent = current;
					current = current.right;
				} else {
					return false;
				}
			}
			if (e.compareTo(parent.item) < 0) {
				parent.left = new TreeNode<E>(e);
				parent.left.parent = parent;
			} else {
				parent.right = new TreeNode<E>(e);
				parent.right.parent = parent;
			}
			size++;
		}
		return true;
	}

	// ����˶�����Ϊ��ȫ������,�򷵻�true
	public boolean isFullBinaryTree() {
		ArrayList<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> current = root;
		list.add(current);
		int index = 0;
		while (index < getSize()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					TreeNode<E> temp = list.get(i);
					list.add(i, temp.left);
					list.add(i + 1, temp.right);
					list.remove(temp);
					index++;
					i++;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	// ���ָ��Ԫ�ص�·��,����������в����ڴ�Ԫ��,�򷵻�null
	public ArrayList<TreeNode<E>> path(E e) {
		if (!had(e)) {
			return null;
		}
		ArrayList<TreeNode<E>> list = new ArrayList<>();
		TreeNode<E> current = root;
		while (current != null) {
			list.add(current);
			if (e.compareTo(current.item) < 0) {
				current = current.left;
			} else if (e.compareTo(current.item) > 0) {
				current = current.right;
			} else {
				break;
			}
		}
		return list;
	}

	@Override
	public void postorder() {
		postorder(root);
	}

	private void postorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.item + " ");
	}

	@Override
	public void postorderNR() {
		TreeNode<E> last = null;
		TreeNode<E> current = root;
		Stack<TreeNode<E>> stack = new Stack<>();
		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.peek();
			if (current.right == null || current.right == last) {
				System.out.print(current.item + " ");
				last = stack.pop();
				current = null;
			} else {
				current = current.right;
			}
		}
	}

	@Override
	public void preorder() {
		preorder(root);
	}

	private void preorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.item + " ");
		preorder(root.left);
		preorder(root.right);
	}

	@Override
	public void preorderNR() {
		TreeNode<E> current = root;
		Stack<TreeNode<E>> stack = new Stack<>();
		while (!stack.isEmpty() || current != null) {
			if (current == null) {
				current = stack.pop();
			}
			System.out.print(current.item + " ");
			if (current.right != null) {
				stack.push(current.right);
			}
			current = current.left;
		}
	}

	@Override
	public boolean remove(E e) {
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.item) < 0) {
				current = current.left;
			} else if (e.compareTo(current.item) > 0) {
				current = current.right;
			} else {
				break;
			}
		}
		if (current == null) {
			return false;
		}
		if (current.left == null) {
			if (current.parent == null) {
				root = current.right;
				current.right.parent = null;
			} else {
				if (e.compareTo(current.parent.item) < 0) {
					current.parent.left = current.right;
					if (current.right != null) { // ����Ҫ����ж�,����java.lang.NullPointerException
						current.right.parent = current.parent.left;
					}
					// help GC
					current.parent = null;
					current.right = null;
					current = null;
				} else {
					current.parent.right = current.right;
					if (current.right != null) { // ����Ҫ����ж�,����java.lang.NullPointerException
						current.right.parent = current.parent.right;
					}
					// help GC
					current.parent = null;
					current.right = null;
					current = null;
				}
			}
		} else {
			TreeNode<E> rm = current.left;
			while (rm.right != null) {
				rm = rm.right;
			}
			current.item = rm.item;
			if (rm.parent.right == rm) {
				rm.parent.right = rm.left;
				if (rm.left != null) { // ����Ҫ����ж�,����java.lang.NullPointerException
					rm.left.parent = rm.parent;
				}
				// help GC
				rm.item = null;
				rm.left = null;
				rm = null;
			} else {
				current.left = rm.left;
				if (rm.left != null) { // ����Ҫ����ж�,����java.lang.NullPointerException
					rm.left.parent = current;
				}
				// help GC
				rm.item = null;
				rm.left = null;
				rm = null;
			}
		}
		size--;
		return true;
	}

}