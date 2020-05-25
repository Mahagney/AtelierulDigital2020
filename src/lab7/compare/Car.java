package lab7.compare;

public class Car implements Comparable<Car>{
    private int engineSize;
    private int year;

    public Car(int engineSize, int year) {
        this.engineSize = engineSize;
        this.year = year;
    }

    @Override
    public int compareTo(Car c){
        if( engineSize == c.getEngineSize()){
            return ((Integer)getYear()).compareTo(c.getYear());
        }
        return ((Integer)getEngineSize()).compareTo(c.getEngineSize());
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineSize=" + engineSize +
                ", year=" + year +
                '}';
    }
}
