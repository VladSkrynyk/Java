package task6_1;

public class Flower extends Item {
    protected boolean odour;
    protected float length;
    protected int color;
    Flower() {
        super();
        odour = false;
        length = 0;
    }

    float getLength() {
        return length;
    }


}
