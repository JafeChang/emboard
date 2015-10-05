package info.jafe.emboard.exceptions;

public class FullUsersException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9017314870504936658L;

	public FullUsersException() {
		super("The users' database table is full.");
	}

}
