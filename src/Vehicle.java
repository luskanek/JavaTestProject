public class Vehicle {
    enum Type {
        BIKE,
        CAR,
    }

    private Type type;

    // false = unoccupied, true = occupied
    private boolean[] seats;

    private int horsepower;

    public Vehicle(Type type, int maxSeats, int horsepower) {
        this.type = type;

        this.seats = new boolean[maxSeats];
        for (int i = 0; i < maxSeats; i++) {
            this.seats[i] = false;
        }

        this.horsepower = horsepower;
    }

    public String GetVehicleType() {
        switch (this.type) {
            case BIKE: {
                if (this.horsepower <= 15)
                    return "Scooter";
                else if (this.horsepower > 15 && this.horsepower <= 50)
                    return "Cruiser";
                else if (this.horsepower > 50 && this.horsepower <= 150)
                    return "Sports Bike";
                else
                    return "Superbike";
            }
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
