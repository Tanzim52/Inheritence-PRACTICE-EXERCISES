import java.awt.Point;

public class LabeledPoint1 {
    private Point location;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.location = new Point(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint[location=" + location + ", label=" + label + "]";
    }
}

// Test Program
public class LabeledPointWithPointTest {
    public static void main(String[] args) {
        LabeledPoint point = new LabeledPoint(5, 10, "A");
        System.out.println(point); // LabeledPoint[location=java.awt.Point[x=5,y=10], label=A]
    }
}
