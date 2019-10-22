package exception;
/**
 * 自定义异常
 * 自定义异常通常用来定义业务逻辑问题，
 * 这种异常java是没有提供的
 * 
 * 自定义异常有几步：
 * 1：定义类，类名应当做到见名知意
 * 2：需要继承自Exception
 * 3：提供所有的构造方法
 * @author tarena
 *
 */
public class IllegalAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	}




