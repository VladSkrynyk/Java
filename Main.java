import task3_5.Interval;

import java.util.ArrayList;
import java.util.Vector;

/**
 * task 3.5
 * @author Vlad Skrynyk
 */
public class Main {
    public static void main(String[] args) {
        //Interval arr[] = {
        //        new Interval(1, 5, true, false),
        //        new Interval(3, 8, false, true)
        //};

        //if (arr[0].overlapsWith(arr[1])) {
        //    Interval mergedInterval = arr[0].mergeWith(arr[1]);
        //    System.out.println("Merged Interval: " + mergedInterval.getIncludeLeft() + mergedInterval.getLeft() +", " + mergedInterval.getRight() + mergedInterval.getIncludeRight() + "");
        //    System.out.println("Distance between ends: " + mergedInterval.getDistance());
        //} else {
        //    System.out.println("Intervals do not overlap.");
        //}

        Vector vector1 = new Vector(new double[]{2, 3});
        Vector vector2 = new Vector(new double[]{4, -2});

        System.out.println("Magnitude of vector1: " + vector1.getMagnitude());
        System.out.println("Magnitude of vector2: " + vector2.getMagnitude());

        System.out.println("Dot product: " + vector1.dotProduct(vector2));

        Vector sum = vector1.add(vector2);
        System.out.println("Sum: (" + sum.components[0] + ", " + sum.components[1] + ")");

        Vector difference = vector1.subtract(vector2);
        System.out.println("Difference: (" + difference.components[0] + ", " + difference.components[1] + ")");

        double scalar = 2.5;
        Vector multiplied = vector1.multiply(scalar);
        System.out.println("Multiplied by " + scalar + ": (" + multiplied.components[0] + ", " + multiplied.components[1] + ")");

        System.out.println("Are collinear: " + vector1.areCollinear(vector2));
        System.out.println("Are orthogonal: " + vector1.areOrthogonal(vector2));
    }
}