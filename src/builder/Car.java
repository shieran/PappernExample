package builder;

public class Car {
    private String type;
    private int seats;
    private String engine;
    private String transmission;

    public Car(Builder builder) {
        this.type = builder.type;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public static final class Builder{
        private String type;
        private int seats;
        private String engine;
        private String transmission;

        private Builder(){

        }

        public Builder withType(String type){
            this.type = type;
            return this;
        }

        public Builder withSeats(int seats){
            this.seats = seats;
            return this;
        }

        public Builder withEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder withTransmission(String transmission){
            this.transmission = transmission;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("type='").append(type).append('\'');
        sb.append(", seats=").append(seats);
        sb.append(", engine='").append(engine).append('\'');
        sb.append(", transmission='").append(transmission).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
