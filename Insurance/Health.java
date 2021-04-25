package Insurance;

public class Health extends Insurance {

    public Health() {
        super("Health");
        setCost();
        //const
    }

    public double healthcost = 196;
    @Override
    void setCost() {
        //method
        monthlyprice = healthcost;
    }

    @Override
    void display() {
        //method
        System.out.print("Insurance type: " + getType() + " with Monthly cost: $" + getPrice());
    }
}
