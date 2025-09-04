package day14.polimorfismodinamico.practice;

public class AreaCalculator {
    public static void main(String[] args) {

        GeometricFigure circle = new Circle(10);
        GeometricFigure rectangle = new Rectangle(5, 10);

        System.out.println("\n===== Area of circle ======");
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\n===== Area of rectangle ======");
        System.out.println("Area: " + rectangle.calculateArea());



    }
}
