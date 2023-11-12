package task6_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


abstract class Toy {
    private double price;

    public Toy(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public abstract double getParameter();
}

class SmallToy extends Toy {
    private int size;

    public SmallToy(double price, int size) {
        super(price);
        this.size = size;
    }

    @Override
    public double getParameter() {
        return size;
    }
}

class MediumToy extends Toy {
    private String category;

    public MediumToy(double price, String category) {
        super(price);
        this.category = category;
    }

    @Override
    public double getParameter() {

        return category.length();
    }
}

class BigToy extends Toy {
    private boolean isInteractive;

    public BigToy(double price, boolean isInteractive) {
        super(price);
        this.isInteractive = isInteractive;
    }

    @Override
    public double getParameter() {
        return isInteractive ? 1 : 0;
    }
}

// Інші класи іграшок
class Dolls extends Toy {
    private String material;

    public Dolls(double price, String material) {
        super(price);
        this.material = material;
    }

    @Override
    public double getParameter() {

        return material.length();
    }
}

class Dice extends Toy {
    private int sides;

    public Dice(double price, int sides) {
        super(price);
        this.sides = sides;
    }

    @Override
    public double getParameter() {
        return sides;
    }
}

class Balls extends Toy {
    private String sport;

    public Balls(double price, String sport) {
        super(price);
        this.sport = sport;
    }

    @Override
    public double getParameter() {

        return sport.length();
    }
}

class GamingRoom {
    private List<Toy> toys;

    public GamingRoom(List<Toy> toys) {
        this.toys = toys;
    }

    public void sortToysByParameter() {

        Collections.sort(toys, Comparator.comparingDouble(Toy::getParameter));
    }

    public Toy findToyInParameterRange(double minParameter, double maxParameter) {

        for (Toy toy : toys) {
            double parameter = toy.getParameter();
            if (parameter >= minParameter && parameter <= maxParameter) {
                return toy;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Toy> toys = new ArrayList<>();
        toys.add(new SmallToy(10.99, 5));
        toys.add(new MediumToy(25.99, "Action Figures"));
        toys.add(new BigToy(50.99, true));
        toys.add(new Dolls(15.99, "Plastic"));
        toys.add(new Dice(5.99, 6));
        toys.add(new Balls(12.99, "Soccer"));

        GamingRoom gamingRoom = new GamingRoom(toys);

        gamingRoom.sortToysByParameter();

        System.out.println("Sorted Toys:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }

        double minParameter = 5;
        double maxParameter = 10;
        Toy foundToy = gamingRoom.findToyInParameterRange(minParameter, maxParameter);

        if (foundToy != null) {
            System.out("no toys");
        }

    }
}