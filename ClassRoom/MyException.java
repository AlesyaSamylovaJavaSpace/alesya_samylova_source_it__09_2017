
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public String toString() {
        return "MyException{}";
    }
}
