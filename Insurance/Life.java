package Insurance;

public class Life extends Insurance {

    public Life() {
        super("Life");
        setCost();
        //const
    }

    public double lifecost = 36;
    @Override
    void setCost() {
        //method
        monthlyprice = lifecost;
    }

    @Override
    void display() {
        //method
        System.out.print("Insurance type: " + getType() + " with Monthly cost: $" + getPrice());
    }
}
