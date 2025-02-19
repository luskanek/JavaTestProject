public class Vehicle {
    enum Type {
        BIKE,
        CAR,
    }

    private Type type;

    public Vehicle(Type type) {
        this.type = type;
    }

    public String GetVehicleType() {
        switch (this.type) {
            case BIKE: return "Bike";
            case CAR: return "Car";
            default: return "None";
        }
    }
}
