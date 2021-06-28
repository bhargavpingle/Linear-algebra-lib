import src.matrix.Matrix;

public class MatrixTest {
    public static void main(String[] args) {
        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{5, 6}, {7, 8}};
        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        Matrix added = m1.add(m2);
        Matrix product = m1.multiply(m2);
        double det = m1.determinant();

        System.out.println("Added Matrix:");
        added.print();
        System.out.println("Product Matrix:");
        product.print();
        System.out.println("Determinant: " + det);
    }
}
