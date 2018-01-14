package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Sweatshirt extends Clothes{

    private float sleeve;
    private float wool;
    
    public Sweatshirt(){
        super();
        System.out.print("Write the sleeve length: ");
        this.sleeve = Float.parseFloat(new Scanner(System.in).nextLine());
        System.out.print("Write percentage of wool: ");
        this.wool = Float.parseFloat(new Scanner(System.in).nextLine());
    }
    
    public Sweatshirt(float sleeve, float wool){
        super();
        this.sleeve = sleeve;
        this.wool = wool;
    }
    
    public Sweatshirt(String manufacturer, float price, String style, float sleeve, float wool){
        super(manufacturer, price, style);
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
    public String toString(){
        return "Clothes {\n   Manufacturer: " + this.getManufacturer() + "\n   "
                + "Price: " + this.getPrice() + "\n   Style: " + this.getStyle() + "\n   "
                + "Sweatshirt {\n      SLeeve: " + getSleeve()+"\n      Wool: " + getWool() + "\n   }\n}";
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
}
