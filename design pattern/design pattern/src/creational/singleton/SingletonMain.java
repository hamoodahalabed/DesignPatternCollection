package creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 = singleton2 ? " + (singleton1 == singleton2));
    }
}
