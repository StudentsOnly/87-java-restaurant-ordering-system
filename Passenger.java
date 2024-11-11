public class Passenger {

  private String passengerName;
  private SeatClass seatClass;
  private double ticketPrice;

  public Passenger(String passengerName, SeatClass seatClass, double ticketPrice) {
    this.passengerName = passengerName;
    this.seatClass = seatClass;
    this.ticketPrice = ticketPrice;
  }

  public String getPassengerName() {
    return passengerName;
  }

  public SeatClass getSeatClass() {
    return seatClass;
  }

  public double getTicketPrice() {
    return ticketPrice;
  }

  @Override
  public String toString() {
    return "%-20s %-20s %-20.2f".formatted(passengerName, seatClass, ticketPrice);
  }
}
