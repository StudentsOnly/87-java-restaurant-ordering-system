import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Flight {
    private final List<Passenger> passengerList;

    public Flight() {
        this.passengerList = new ArrayList<>();
    }

    public void reserveSeat(String passengerName, SeatClass seatClass) {
        Passenger passenger = new Passenger(passengerName, seatClass);
        passengerList.add(passenger);
        System.out.println("Reservation successful for " + passengerName + " in " + seatClass + " class.");
    }

    public void cancelReservation(String passengerName) {
        Optional<Passenger> passengerToCancel = passengerList.stream()
                .filter(passenger -> passenger.getPassengerName().equalsIgnoreCase(passengerName))
                .findFirst();

        passengerToCancel.ifPresentOrElse(
                passenger -> {
                    passengerList.remove(passenger);
                    System.out.println("Reservation canceled for " + passengerName + ".");
                },
                () -> System.out.println("No reservation found for " + passengerName + ".")
        );
    }

    public void displayPassengerList() {
        if (passengerList.isEmpty()) {
            System.out.println("No passengers.");
        } else {
            passengerList.forEach(System.out::println);
        }
    }

    public double calculateTotalRevenue() {
        return passengerList.stream()
                .mapToDouble(Passenger::getTicketPrice)
                .sum();
    }
}