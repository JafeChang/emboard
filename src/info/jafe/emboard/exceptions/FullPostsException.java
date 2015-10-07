package info.jafe.emboard.exceptions;

public class FullPostsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 874244423110339627L;
	public FullPostsException(){
		super("The posts' database table is full.");
	}

}
