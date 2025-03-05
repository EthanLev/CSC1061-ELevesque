
public class NegativeAgeException extends IllegalArgumentException {
	public NegativeAgeException() {}
	
	public NegativeAgeException(String message) {
		super(message);
	}
	
	public NegativeAgeException(Throwable cause) {
		super(cause);
	}
	
	public NegativeAgeException(String message, Throwable cause) {
		super(message, cause);
	}
}
