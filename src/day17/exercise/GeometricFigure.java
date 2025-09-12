package day17.exercise;

abstract public class GeometricFigure {

    private String nameFigure;

    public GeometricFigure(String nameFigure){
        this.nameFigure = nameFigure;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    abstract public double calculateArea();

    public void printArea(){
        System.out.println("\n==== Details of figure ====");
        System.out.printf("%-7s: %s%n", "Name",this.nameFigure);
        System.out.printf("%-7s: %.2f%n","Area", calculateArea());
    }


}
