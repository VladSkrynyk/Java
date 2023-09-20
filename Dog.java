package task1_6;
/**
 * task 1_6, custom class
 * @author Vlad Skrynyk
 */
public class Dog {
    private String name;
    private String say;
    public void voice() {
        System.out.println("dog: " + name + ", sad: " + say);
    };
    public void setName(String name) {
        this.name = name;
    };
    public void setSay(String say) {
        this.say = say;
    }
}
