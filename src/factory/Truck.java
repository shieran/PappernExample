package factory;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("products were delivered by truck");
    }
}
