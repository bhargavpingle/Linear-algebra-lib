import src.vector.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector v1 = new Vector(new double[]{1, 2});
        Vector v2 = new Vector(new double[]{3, 4});

        assert v1.add(v2).toString().equals("[4.0, 6.0]");
        assert v1.subtract(v2).toString().equals("[-2.0, -2.0]");
        assert v1.scalarMultiply(2).toString().equals("[2.0, 4.0]");
        assert v1.dot(v2) == 11.0;
        System.out.println("All vector tests passed!");
    }
}
