package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Windbreaker extends Jacket{
    
    private String manufacturer;
    private float price;
    private String style;
    
    public Windbreaker(){
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
    }
    
    public Windbreaker(String manufacturer, float price, String style){
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
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
