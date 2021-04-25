package GeoFigures;

public class Triangle extends GeometricFigure {

    public double area;

    public Triangle (double height, double width, String figuretype) {
        super(height, width, figuretype);
        //const
    }

    @Override
    public double area (double height, double weight) {
        //method
        area = (height * weight * 0.5);
        return area;
    }

}
