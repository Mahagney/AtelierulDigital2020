package lab6.ch2;

public class Heels implements Shoe {
    private double size;
    private String color;

    public Heels(double size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Heels{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
