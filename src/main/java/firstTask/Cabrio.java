package firstTask;

public class Cabrio {
    private String brand;
    private String model;
    private boolean moving;
    private boolean roofOpen;

    public Cabrio(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if (moving) {
            System.out.println("You cannot open or fold the roof while driving!");
        }
        else {
            this.roofOpen = roofOpen;
        }
    }
}
