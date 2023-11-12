package task5_15;

import java.util.Arrays;
import java.util.Objects;

class Window {
    private boolean isOpen;

    public Window() {
        this.isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Window window = (Window) obj;
        return isOpen == window.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen);
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}

class Door {
    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Door door = (Door) obj;
        return isOpen == door.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen);
    }

    @Override
    public String toString() {
        return "Door{" +
                "isOpen=" + isOpen +
                '}';
    }
}

class House {
    private Window[] windows;
    private Door[] doors;

    public House(int windowCount, int doorCount) {
        this.windows = new Window[windowCount];
        this.doors = new Door[doorCount];

        for (int i = 0; i < windowCount; i++) {
            windows[i] = new Window();
        }

        for (int i = 0; i < doorCount; i++) {
            doors[i] = new Door();
        }
    }

    public void closeAllDoorsAndWindows() {
        for (Window window : windows) {
            window.close();
        }

        for (Door door : doors) {
            door.close();
        }
    }

    public int getWindowCount() {
        return windows.length;
    }

    public int getDoorCount() {
        return doors.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        House house = (House) obj;
        return Arrays.equals(windows, house.windows) && Arrays.equals(doors, house.doors);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(windows);
        result = 31 * result + Arrays.hashCode(doors);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + Arrays.toString(windows) +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        House house = new House(5, 2);

        System.out.println("Initial state:");
        System.out.println("Window count: " + house.getWindowCount());
        System.out.println("Door count: " + house.getDoorCount());
        System.out.println(house);

        System.out.println("\nClosing all doors and windows:");
        house.closeAllDoorsAndWindows();
        System.out.println(house);
    }
}

