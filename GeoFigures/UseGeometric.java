package GeoFigures;

public class UseGeometric {
    public static void main (String [] args){

        double height, width, area;
        String figuretype;

        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Square(4,4,"Square");
        figures[1] = new Triangle(6,6,"Triangle");
        figures[2] = new Triangle(2,3,"Triangle");

        for (GeometricFigure figure : figures) {
            height = figure.getHeight();
            width = figure.getWidth();
            figuretype = figure.getFiguretype();
            area = figure.area(height, width);

            System.out.println("The Geometric figure is a " + figuretype + ". Height: " + height + " Width: " + width + " and a total area of: " + area);
        }

    }
}
