package task6_1;

import java.time.LocalDate;

public abstract class Item implements Comparable<Item> {
    private String name;
    private float price;
    private LocalDate time;

    public Item() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getTime() {
        return this.time;
    }

    public float getPrice() {
        return this.price;
    }

    public int compareTo(Item other) {
        return Integer.compare(this.getTime().getDayOfYear(), other.getTime().getDayOfYear());
    }
}
