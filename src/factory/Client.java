package factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("enter transport type");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        ITransport transport = LogisticFactory.getTransportForDelivery(name);
        transport.deliver();
    }
}
