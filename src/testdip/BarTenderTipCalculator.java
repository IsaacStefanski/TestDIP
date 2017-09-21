package testdip;

/**
 *
 * @author Isaac
 */
public class BarTenderTipCalculator implements TipCalculator {
    private int drinkQty;
    private double tipPerDrink;
    
    public BarTenderTipCalculator(int drinkQty, double tipPerDrink){
        this.drinkQty = drinkQty;
        this.tipPerDrink = tipPerDrink;
    }
    
    @Override
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