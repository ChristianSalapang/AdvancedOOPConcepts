package Books;

public class Fiction extends Book {

    public Fiction (String booktitle) {
        super(booktitle);
        setPrice();
        //const
    }

    @Override
    public void setPrice() {
        //method
        bookprice = 24.99;
    }

    void display() {
        System.out.println("Fiction book title: " + getBooktitle() + " Price: $" + getBookprice());
    }
}
