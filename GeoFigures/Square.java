package GeoFigures;

public class Square extends GeometricFigure {

    public double area;

    public Square (double height, double width, String figuretype) {
        super(height, width, figuretype);
        //const
    }

    @Override
    public double area (double height, double weight) {
        //method
        area = (height * weight);
        return area;
    }

}
