package src.vector;

import java.util.Arrays;

public class Vector {
    private double[] elements;

    public Vector(double[] elements) {
        this.elements = elements;
    }

    public Vector add(Vector other) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = this.elements[i] + other.elements[i];
        }
        return new Vector(result);
    }

    public Vector subtract(Vector other) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = this.elements[i] - other.elements[i];
        }
        return new Vector(result);
    }

    public Vector scalarMultiply(double scalar) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i] * scalar;
        }
        return new Vector(result);
    }

    public double dot(Vector other) {
        double result = 0;
        for (int i = 0; i < elements.length; i++) {
            result += this.elements[i] * other.elements[i];
        }
        return result;
    }

    public double magnitude() {
        double sum = 0;
        for (double e : elements) {
            sum += e * e;
        }
        return Math.sqrt(sum);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
