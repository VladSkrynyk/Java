package task3;
/**
 * task 1_3 custom class
 * @author Vlad Skrynyk
 */
public class AccessModifiersExample {
    public int publicField = 1;
    private int privateField = 2;
    protected int protectedField = 3;
    int packagePrivateField = 4;
    public void publicMethod() {
        System.out.println("Це загальнодоступний метод.");
    }
    private void privateMethod() {
        System.out.println("Це приватний метод.");
    }
    protected void protectedMethod() {
        System.out.println("Це захищений метод.");
    }
    void packagePrivateMethod() {
        System.out.println("Це метод з доступом до пакету.");
    }
}
