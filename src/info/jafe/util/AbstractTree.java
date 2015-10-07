package info.jafe.util;

public interface AbstractTree<E> {

	boolean add(E e);

	void breadthorder();

	void clear();
	
	int getSize();

	public boolean had(E e) ;

	void inorder();

	void inorderNR();

	boolean insert(E e);

	void postorder();

	void postorderNR();

	void preorder();

	void preorderNR();

	boolean remove(E e);

}
