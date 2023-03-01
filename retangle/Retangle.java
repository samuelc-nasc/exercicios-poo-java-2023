package retangle;

public class Retangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }
    public double perimetro() {
        return 2 * (width + height);
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public String toString() {
        return "AREA = "
            + String.format("%.2f%n", area())
            + "PERIMETER = "
            + String.format("%.2f%n", perimetro())
            + "DIAGONAL = "
            + String.format("%.2f%n", diagonal());
    }


}
