package task4_14;

import java.util.Arrays;
/**
 * task 4.14
 * @author Vlad Skrynyk
 */
public class Vector {
    private double[] components;

    public Vector(double[] components) {
        this.components = Arrays.copyOf(components, components.length);
    }

    public double getMagnitude() {
        double sum = 0;
        for (double component : components) {
            sum += Math.pow(component, 2);
        }
        return Math.sqrt(sum);
    }

    public double dotProduct(Vector other) {
        double result = 0;
        for (int i = 0; i < components.length; i++) {
            result += components[i] * other.components[i];
        }
        return result;
    }

    public Vector add(Vector other) {
        double[] resultComponents = new double[components.length];
        for (int i = 0; i < components.length; i++) {
            resultComponents[i] = components[i] + other.components[i];
        }
        return new Vector(resultComponents);
    }

    public Vector subtract(Vector other) {
        double[] resultComponents = new double[components.length];
        for (int i = 0; i < components.length; i++) {
            resultComponents[i] = components[i] - other.components[i];
        }
        return new Vector(resultComponents);
    }

    public Vector multiply(double scalar) {
        double[] resultComponents = new double[components.length];
        for (int i = 0; i < components.length; i++) {
            resultComponents[i] = components[i] * scalar;
        }
        return new Vector(resultComponents);
    }

    public boolean areCollinear(Vector other) {
        return this.dotProduct(other) == this.getMagnitude() * other.getMagnitude();
    }

    public boolean areOrthogonal(Vector other) {
        return this.dotProduct(other) == 0;
    }
}
