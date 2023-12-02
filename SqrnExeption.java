package task1;

public class SqrnExeption extends ArithmeticException{
    public String detail;

    SqrnExeption(String message) {
        this.detail = message;
    }

    @Override
    public String toString() {
        return "D is negative, no real roots! " + detail;
    }
}
