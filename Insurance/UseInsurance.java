package Insurance;
import java.util.Scanner;

public class UseInsurance {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Type 1 for Life and 2 for Health insurance");

        int x = scan.nextInt();
        if(x == 1) {
            Life Linsurance= new Life();
            Linsurance.display();
        }
        else {
            Health Hinsurance = new Health();
            Hinsurance.display();
        }
    }

}
