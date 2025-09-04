package day14.polimorfismodinamico.practice;

public class Circle extends GeometricFigure {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
