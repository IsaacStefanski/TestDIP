package testdip;

/**
 *
 * @author Isaac
 */
public class Startup {

    public static void main(String[] args) {
        //Initialize worker object
        RestaurantTipCalculator calc = new RestaurantTipCalculator(100, .10);
        
        TipService tipService = new TipService(calc);
        double tip = tipService.calcTip();
        
        System.out.println("The tip is: " + tip);
    }    
}