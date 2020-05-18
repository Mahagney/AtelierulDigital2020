package lab6.ch1;

public class EUR extends Currency {
    public EUR(double units) {
        super(units);
    }
    public EUR() { super();}

    public String toString(){
        return "EUR: " + getUnits();
    }
}
