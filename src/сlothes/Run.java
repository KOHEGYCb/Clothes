package сlothes;

import сlothes.product.Jacket;
import сlothes.product.Pants;
import сlothes.product.Sweatshirt;
import сlothes.service.WriteInfo;

/**
 *
 * @author dmitry
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jacket jacket =  new Jacket();
        Sweatshirt sweatshirt = new Sweatshirt();
        Pants pants = new Pants();
        
        System.out.println(WriteInfo.writeInfo(jacket));
        System.out.println(WriteInfo.writeInfo(pants));
        System.out.println(WriteInfo.writeInfo(sweatshirt));
    }
    
}
