package factory;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("products were delivered by ship");
    }
}
