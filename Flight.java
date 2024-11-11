import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flight {

  private List<Passenger> passengers = new ArrayList<>();

  public void reserveSeat(String passengerName, SeatClass seatClass) {

    double ticketPrize = switch(seatClass) {
      case SeatClass.FIRST_CLASS -> 200.00;
      case SeatClass.BUSINESS_CLASS -> 100.00;
      case SeatClass.ECONOMY_CLASS -> 50.00;
      default -> throw new IllegalArgumentException("SeatClass not found.");
    };

    reserveSeat(new Passenger(passengerName, seatClass, ticketPrize));
  }

  private boolean reserveSeat(Passenger passenger) {

    if (passenger == null) {
      System.out.println("Passenger is null.");
      return false;
    }
    return passengers.add(passenger);
  }

  public void cancelReservation(String passengerName) {

    Passenger deletePassenger = null;
    Iterator<Passenger> iterator = passengers.listIterator();
    while (iterator.hasNext()) {
      Passenger p = iterator.next();
      if (p.getPassengerName().equalsIgnoreCase(passengerName)) {
        iterator.remove();
      }
    }
  }

  public void displayPassengerList() {
    System.out.printf("%-20s %-20s %-20s%n", "PASSENGER", "SEATCLASS", "TICKET PRICE");
    System.out.println("---------------------------------");
    passengers.forEach(System.out::println);
    System.out.println();
  }

  public double ticketRevenueTotal() {

    return passengers.stream()
      .mapToDouble(Passenger::getTicketPrice)
      .sum();
  }
}
