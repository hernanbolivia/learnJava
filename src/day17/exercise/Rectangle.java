package day17.exercise;

public class Rectangle extends GeometricFigure{

    private double width;
    private double height;

    public Rectangle(String nameFigure, double width, double height) {
        super(nameFigure);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
