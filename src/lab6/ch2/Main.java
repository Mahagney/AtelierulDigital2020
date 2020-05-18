package lab6.ch2;

public class Main {
    public static void main(String[] args) {
        Running rl = new Running(21,"Red");
        Running rr = new Running(21,"Red");

        Heels hl = new Heels(20,"Red");
        Heels hr = new Heels(20,"Red");

        try {
            Pair<Running> runningPair = new Pair<Running>(rl, rr);
            Pair<Heels> hellsPair = new Pair<Heels>(hl, hr);
            System.out.println(runningPair);
            System.out.println(hellsPair);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
