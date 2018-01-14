package сlothes.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Pants extends Clothes {

    private boolean isPinser;

    public Pants() {
        super();
        System.out.print("Write the sleeve length: ");
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
        super();
        this.isPinser = isPinser;
    }

    public Pants(String manufacturer, float price, String style, boolean isPinser) {
        super(manufacturer, price, style);
        this.isPinser = isPinser;
    }
    
    @Override
    public String toString(){
        return "Clothes {\n   Manufacturer: " + this.getManufacturer() + "\n   "
                + "Price: " + this.getPrice() + "\n   Style: " + this.getStyle() + "\n   "
                + "Pants {\n      Has pinser: " + isPinser() + "\n   }\n}";
    }

    public boolean isPinser() {
        return isIsPinser();
    }

    /**
     * @return the isPinser
     */
    public boolean isIsPinser() {
        return isPinser;
    }

    /**
     * @param isPinser the isPinser to set
     */
    public void setIsPinser(boolean isPinser) {
        this.isPinser = isPinser;
    }
}
