package tasca1.Main;

import tasca1.Moduls.EmptySaleExceptions;
import tasca1.Moduls.Sale;

public class Main {

    public static void main(String[] args) {

        try{
            Sale sale = new Sale();
            sale.calculateTotal();
        } catch (EmptySaleExceptions emptySaleExceptions) {
            emptySaleExceptions.printStackTrace();
        }
    }
}
