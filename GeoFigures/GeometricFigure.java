package GeoFigures;

public abstract class GeometricFigure {

    private double height, width, area;
    private String figuretype;

    public GeometricFigure (double height, double width, String figuretype) {

        this.height = height;
        this.width = width;
        this.figuretype = figuretype;
    }

    public String getFiguretype() {
        return figuretype;
    }
    public void setFiguretype(String figuretype)
    {
        this.figuretype = figuretype;
    }

    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    public abstract double area (double height, double weight);
}
