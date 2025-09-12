package day17.exercise;

public class Main {
    public static void main(String[] args) {

        GeometricFigure circle = new Circle("Circle",5.0);
        GeometricFigure rectangle = new Rectangle("Rectangle",5.0, 10.0);
        GeometricFigure triangle = new Triangle("Triangle",5.0, 10.0);

        circle.printArea();
        rectangle.printArea();
        triangle.printArea();

    }
}
