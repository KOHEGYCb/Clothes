package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Clothes {
    
    private String manufacturer;
    private float price;
    private String style;
    
    public Clothes(){
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
    }
    
    public Clothes(String manufacturer, float price, String style){
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }
    
    @Override
    public String toString(){
        return "Clothes {\n   Manufacturer: " + manufacturer + "\n  Price: " + price + "\n   Style: " + style + "\n}";
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }
}
