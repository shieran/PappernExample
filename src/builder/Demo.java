package builder;

public class Demo{
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .withEngine("petrol")
                .withType("sedan")
                .build();
        System.out.println(car.toString());

        Car car2 = Car.newBuilder()
                .withType("hatchback")
                .withEngine("gas")
                .withSeats(4)
                .withTransmission("auto")
                .build();
        System.out.println(car2.toString());
    }
}
