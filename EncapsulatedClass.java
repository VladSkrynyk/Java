package task4;
/**
 * task 1_4
 * @author Vlad Skrynyk
 */
public class EncapsulatedClass {
    protected int data;
    public void setData(int value) {
        this.data = value;
    }
    public int getData() {
        return this.data;
    }
}
class Main {
    public static void main(String[] args) {
        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setData(42);
        System.out.println("Значення поля: " + obj.getData());
    }
}