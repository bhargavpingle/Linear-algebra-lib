package src;

import src.vector.Vector;
import src.matrix.Matrix;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(new double[]{1, 2, 3});
        Vector v2 = new Vector(new double[]{4, 5, 6});
        System.out.println("Vector Addition: " + v1.add(v2));
        System.out.println("Dot Product: " + v1.dot(v2));

        double[][] data1 = {
                {1, 2},
                {3, 4}
        };
        double[][] data2 = {
                {5, 6},
                {7, 8}
        };

        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);
        System.out.println("Matrix Addition:");
        m1.add(m2).print();

        System.out.println("Matrix Product:");
        m1.multiply(m2).print();

        System.out.println("Determinant: " + m1.determinant());
    }
}