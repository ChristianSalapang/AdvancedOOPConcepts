package Insurance;

public abstract class Insurance {

    public String Itype;
    public double monthlyprice;

    public Insurance (String Insurancetype) {
        Itype = Insurancetype;
    }

    public String getType() {
        return Itype;
    }

    public double getPrice() {
        return monthlyprice;
    }

    abstract void setCost();
    abstract void display();
}
