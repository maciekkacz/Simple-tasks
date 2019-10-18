package fourthTask;

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(9, 0);
        Point p3 = new Point(9, 14);
        Point p4 = new Point(0, 14);

        final Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        double rectArea = ShapeCalculator.rectangleArea(rectangle);
        System.out.println("Rectangle area " + rectArea);

        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);
        Point ok = new Point(0, 3);
        Point notOk = new Point(0, 6);
        boolean pointInsideCircleOk = ShapeCalculator.isPointInsideCircle(circle, ok);
        boolean pointInsideCircleNotOk = ShapeCalculator.isPointInsideCircle(circle, notOk);
        System.out.println("The first point lies in a circleęgu: " + pointInsideCircleOk);
        System.out.println("The second point lies in a circle: " + pointInsideCircleNotOk);

    }
}

