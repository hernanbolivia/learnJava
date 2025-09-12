package day17.exercise;

public class Triangle extends GeometricFigure{

    private double base;
    private double height;

    public Triangle(String nameFigure, double base, double height) {
        super(nameFigure);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (this.base * this.height)/2;
    }
}
