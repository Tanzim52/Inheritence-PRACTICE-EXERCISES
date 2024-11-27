public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint[x=" + x + ", y=" + y + ", label=" + label + "]";
    }
}

// Test Program
public class LabeledPointTest {
    public static void main(String[] args) {
        LabeledPoint point = new LabeledPoint(5, 10, "A");
        System.out.println(point); // LabeledPoint[x=5, y=10, label=A]
    }
}
