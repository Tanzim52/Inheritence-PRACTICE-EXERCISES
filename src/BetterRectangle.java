import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

// Test Program
public class BetterRectangleTest {
    public static void main(String[] args) {
        BetterRectangle rect = new BetterRectangle(0, 0, 5, 10);
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
    }
}
