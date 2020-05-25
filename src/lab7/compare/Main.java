package lab7.compare;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1000, 2020));
        cars.add(new Car(1000, 2019));
        cars.add(new Car(2000, 2020));
        cars.add(new Car(900, 2020));

        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);
    }
}
