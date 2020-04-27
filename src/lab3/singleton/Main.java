package lab3.singleton;

public class Main {
    public static void main(String[] args) {
        LazyInit lazyInit=LazyInit.getInstance();
        System.out.println(lazyInit);

        LazyInit lazyInit1=LazyInit.getInstance();
       System.out.println(lazyInit1);
    }
}
