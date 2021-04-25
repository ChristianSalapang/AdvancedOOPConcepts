package Books;

public class BookArray {

    public static void main(String[] args) {

        Book[] selection = new Book[10];
        selection[0] = new Fiction("Crime and Punishment");
        selection[1] = new NonFiction("Silent Spring");
        selection[2] = new Fiction("Shantaram");
        selection[3] = new Fiction("Atonement");
        selection[4] = new NonFiction("In Cold Blood");
        selection[5] = new Fiction("Clockwork Orange");
        selection[6] = new Fiction("One Hundred Years of Solitude");
        selection[7] = new NonFiction("Educated");
        selection[8] = new Fiction("A Gentleman in Moscow");
        selection[9] = new Fiction("Catch-22");

        int i = 0;
        while (i < selection.length) {
            System.out.println("Book Title: " + selection[i].getBooktitle() + " Price: $" + selection[i].getBookprice());
            ++i;
        }
    }
}
