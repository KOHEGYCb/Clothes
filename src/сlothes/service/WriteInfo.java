package сlothes.service;

import сlothes.product.Clothes;
import сlothes.product.Jacket;
import сlothes.product.Pants;
import сlothes.product.Sweatshirt;

/**
 *
 * @author dmitry
 */
public class WriteInfo {
    
    private WriteInfo(){}
    
    public static String writeInfo(Clothes clothes){
        return clothes.toString();
    }
    
    public static String writeInfo(Pants pants){
        return pants.toString();
    }
    
    public static String writeInfo(Sweatshirt sweatshirt){
        return sweatshirt.toString();
    }
    
    public static String writeInfo(Jacket jacket){
        return jacket.toString();
    }
    
}
