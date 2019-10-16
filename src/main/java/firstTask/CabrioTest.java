package firstTask;

public class CabrioTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Audi", "A6");
        cabrio.setRoofOpen(true);
        System.out.printf("Car Status. In motion:%s, Open roof: %s\n",cabrio.isMoving(),cabrio.isRoofOpen());
        cabrio.setMoving(true);
        cabrio.setRoofOpen(false);
        System.out.printf("Car Status. In motion:%s, Open roof: %s\n",cabrio.isMoving(),cabrio.isRoofOpen());
    }
}
