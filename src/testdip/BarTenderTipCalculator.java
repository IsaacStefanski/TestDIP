package testdip;

/**
 *
 * @author Isaac
 */
public class BarTenderTipCalculator {
    private int drinkQty;
    private double tipPerDrink;
    
    public BarTenderTipCalculator(int drinkQty, double tipPerDrink){
        this.drinkQty = drinkQty;
        this.tipPerDrink = tipPerDrink;
    }
    
    public final double calcTip(){
        return drinkQty * tipPerDrink;
    }

    public final int getDrinkQty() {
        return drinkQty;
    }

    public final void setDrinkQty(int drinkQty) {
        this.drinkQty = drinkQty;
    }

    public final double getTipPerDrink() {
        return tipPerDrink;
    }

    public final void setTipPerDrink(double tipPerDrink) {
        this.tipPerDrink = tipPerDrink;
    }
}