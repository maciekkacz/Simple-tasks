package secondTask;

public class BarmanTest {
    public static void main(String[] args) {
        Drink drink1 = Barman.createDrink("Pineapple juice",200,
                " Malibu liqueur", 50,"Coconut milk", 200);
        Drink drink2 = Barman.createDrink("Apple juice", 250,"Plum liqueur",50,
                "Rice milk", 40);

        Barman.printDrink(drink1);
        Barman.printDrink(drink2);
    }
}
