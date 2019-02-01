package factory;

public class LogisticFactory {
    static ITransport getTransportForDelivery(String name){
        ITransport transport = null;
        switch (name){
            case "truck":
                transport = new Truck();
                break;
            case "ship":
                transport = new Ship();
                break;
            default:
                System.out.println("unknown transport");
        }
        return transport;
    }
}
