package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Pants implements Clothes, Object {

    private boolean isPinser;
    private String manufacturer;
    private float price;
    private String style;

    public Pants() {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        System.out.print("Write has pants have a pinser (Y/N): ");
        switch (new Scanner(System.in).nextLine()) {
            case "Y":
                this.isPinser = true;
                break;
            case "y":
                this.isPinser = true;
                break;
            default:
                this.isPinser = false;
        }

    }

    public Pants(boolean isPinser) {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        this.isPinser = isPinser;
    }

    public Pants(String manufacturer, float price, String style, boolean isPinser) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
        this.isPinser = isPinser;
    }

    @Override
    public String toString() {
        return "Clothes {\n   Manufacturer: " + this.getManufacturer() + "\n   "
                + "Price: " + this.getPrice() + "\n   Style: " + this.getStyle() + "\n   "
                + "Pants {\n      Has pinser: " + this.isPinser() + "\n   }\n}";
    }

    public boolean isPinser() {
        return isPinser;
    }

    public void setIsPinser(boolean isPinser) {
        this.isPinser = isPinser;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getStyle() {
        return style;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }
    
        @Override
    public void print() {
        System.out.println(toString());
    }
}
