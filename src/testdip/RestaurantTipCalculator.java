package testdip;

/**
 *
 * @author Isaac
 */
public class RestaurantTipCalculator {
    private double billAmt;
    private double tipPercent;
    
    public RestaurantTipCalculator(double billAmt, double tipPercent){
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }
    
    public final double calcTip(){
        return billAmt * tipPercent;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
}