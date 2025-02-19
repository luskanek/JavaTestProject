public class Vehicle {
    enum Type {
        BIKE,
        CAR,
    }

    private Type type;

    // false = unoccupied, true = occupied
    private boolean[] seats;

    public Vehicle(Type type, int maxSeats) {
        this.type = type;

        this.seats = new boolean[maxSeats];
        for (int i = 0; i < maxSeats; i++) {
            this.seats[i] = false;
        }
    }

    public String GetVehicleType() {
        switch (this.type) {
            case BIKE: return "Bike";
            case CAR: return "Car";
            default: return "None";
        }
    }

    public int GetNumOccupiedSeats() {
        int result = 0;
        for (int i = 0; i < this.seats.length; i++) {
            if (this.seats[i]) result++;
        }
        return result;
    }
}
