public class Audi implements Car{
    @Override
    public void start() {
        System.out.println("Audi has started");
    }

    @Override
    public void drive() {
        System.out.println("I am driving the Audi");
    }
}
