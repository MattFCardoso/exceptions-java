package exception;


//what's the main difference between Exception and RuntimeException?
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
