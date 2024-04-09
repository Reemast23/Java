import Graphic.Rectangle;
import Graphic.Triangle;
import Graphic.Square;
import Graphic.Circle;
public class TestShape {
public static void main(String[] args) {
Rectangle rectangle = new Rectangle(5, 3);
Triangle triangle = new Triangle(4, 6);
Square square = new Square(4);
Circle circle = new Circle(3);
System.out.println("Area of Rectangle: " + rectangle.calculateArea());
System.out.println("Area of Triangle: " + triangle.calculateArea());
System.out.println("Area of Square: " + square.calculateArea());
System.out.println("Area of Circle: " + circle.calculateArea());
}
}
