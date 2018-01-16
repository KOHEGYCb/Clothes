package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Sweatshirt implements Clothes, Object {

    private float sleeve;
    private float wool;
    private String manufacturer;
    private float price;
    private String style;

    public Sweatshirt() {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        System.out.print("Write the sleeve length: ");
        this.sleeve = Float.parseFloat(new Scanner(System.in).nextLine());
        System.out.print("Write percentage of wool: ");
        this.wool = Float.parseFloat(new Scanner(System.in).nextLine());
    }

    public Sweatshirt(float sleeve, float wool) {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        this.sleeve = sleeve;
        this.wool = wool;
    }

    public Sweatshirt(String manufacturer, float price, String style, float sleeve, float wool) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
        this.sleeve = sleeve;
        this.wool = wool;
    }

    public float getSleeve() {
        return sleeve;
    }

    public float getWool() {
        return wool;
    }

    @Override
    public String toString() {
        return "Clothes {\n   Manufacturer: " + this.getManufacturer() + "\n   "
                + "Price: " + this.getPrice() + "\n   Style: " + this.getStyle() + "\n   "
                + "Sweatshirt {\n      SLeeve: " + this.getSleeve() + "\n      Wool: " + this.getWool() + "\n   }\n}";
    }

    /**
     * @param sleeve the sleeve to set
     */
    public void setSleeve(float sleeve) {
        this.sleeve = sleeve;
    }

    /**
     * @param wool the wool to set
     */
    public void setWool(float wool) {
        this.wool = wool;
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
