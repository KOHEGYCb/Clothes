package сlothes.product;

import java.util.Scanner;
import сlothes.service.Seasons;

/**
 *
 * @author dmitry
 */
public abstract class Jacket implements Clothes, Object {

    private Seasons season;
    private boolean isHood;
    private String manufacturer;
    private float price;
    private String style;

    public Jacket() {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        System.out.print("Write season: \n  1: Winter\n  2: Spring\n  3: Summer\n  4: Autumn\nSeason: ");
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                season = Seasons.WINTER;
                break;
            case "2":
                season = Seasons.SPRING;
                break;
            case "3":
                season = Seasons.SUMMER;
                break;
            case "4":
                season = Seasons.AUTUMN;
        }
        System.out.print("Write is jacket has hood (Y/N): ");
        switch (new Scanner(System.in).nextLine()) {
            case "Y":
                isHood = true;
                break;
            case "y":
                isHood = true;
                break;
            default:
                isHood = false;
                break;
        }
    }

    public Jacket(Seasons season, boolean isHood) {
        System.out.print("Clothes creater: \nWrite manufacturer: ");
        manufacturer = new Scanner(System.in).nextLine();
        System.out.print("Write price: ");
        price = new Scanner(System.in).nextFloat();
        System.out.print("Write style: ");
        style = new Scanner(System.in).nextLine();
        this.season = season;
        this.isHood = isHood;
    }

    public Jacket(String manufacturer, float price, String style, Seasons season, boolean isHood) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.style = style;
        this.season = season;
        this.isHood = isHood;
    }

    @Override
    public String toString() {
        return "Clothes {\n   Manufacturer: " + this.getManufacturer() + "\n   "
                + "Price: " + this.getPrice() + "\n   Style: " + this.getStyle() + "\n   "
                + "Jacket {\n      Season: " + this.getSeason() + "\n      Has hood: " + this.isHood() + "\n   }\n}";
    }

    public Seasons getSeason() {
        return season;
    }

    public boolean isHood() {
        return isHood;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(Seasons season) {
        this.season = season;
    }

    /**
     * @param isHood the isHood to set
     */
    public void setIsHood(boolean isHood) {
        this.isHood = isHood;
    }
    
    
}
