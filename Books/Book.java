package Books;

public abtract class Book {

    public String booktitle;
    public double bookprice;

    public Book (String Booktitle) {
        this.booktitle = booktitle;
        this.bookprice = 0;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public double getBookprice() {
        return bookprice;
    }

    public abstract void setPrice();
}
