package lab4.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage dr = new DarkRoast();
        Beverage drw= new Whip(dr);

        Beverage hb = new HouseBlend();
        hb = new Mocha(hb);
        hb = new Whip(hb);
        hb = new Whip(hb);


        System.out.println(drw.getDescription() + " cost=" +drw.getCost());
        System.out.println(dr.getDescription()+ " cost=" +dr.getCost());
        System.out.println(hb.getDescription()+ " cost=" +hb.getCost());
    }
}
