package lab6.ch1;

public class USD extends Currency {
    public USD(double units) {
        super(units);
    }

    public USD() {
        super();
    }

    public String toString(){
        return "USD: " + getUnits();
    }
}
