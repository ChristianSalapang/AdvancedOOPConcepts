package Books;

public class NonFiction extends Book {

    public NonFiction (String booktitle) {
        super(booktitle);
        setPrice();
        //const
    }

    @Override
    public void setPrice() {
        //method
        bookprice = 37.99;
    }

    void display() {
        System.out.println("Non-Fiction book title: " + getBooktitle() + " Price: $" + getBookprice());
    }
}
