package info.jafe.emboard.exceptions;

public class IncorrectUserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3075819124482684583L;
	/**
	 * This exception throws when adding post and the user incorrect.
	 * 
	 * [INCORRECT_USER_WHEN_ADDPOST = 1]
	 */
	public static final int INCORRECT_USER_WHEN_ADDPOST = 1;

	public IncorrectUserException() {
		super("Incorrect user exception happens with unknown reasons.");
	}

	public IncorrectUserException(int exceptionReason) {
		super("Incorrect user exception happens with unknown reasons.");
		switch (exceptionReason) {
		case INCORRECT_USER_WHEN_ADDPOST:
			System.err.println("This exception throws when adding post and the user incorrect.");
			break;
		default:
			;

		}
	}
}
