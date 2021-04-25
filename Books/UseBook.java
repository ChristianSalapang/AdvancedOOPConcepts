package Books;

public class UseBook {

    public static void main(String [] args) {

        Book[] selection = new Book[3];
        selection[0] = new Fiction("Atonement");
        selection[1] = new NonFiction("Educated");
        selection[2] = new Fiction("Clockwork Orange");

        int i = 0;
        while (i < selection.length) {
            System.out.println("Book Title: " + selection[i].getBooktitle() + " Price: $" + selection[i].getBookprice());
            ++i;
        }
    }
}
