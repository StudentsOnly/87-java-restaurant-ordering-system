public class Main {

  public static void main(String[] args) {

    Flight flight = new Flight();

    flight.reserveSeat("Gert", SeatClass.ECONOMY_CLASS);
    flight.reserveSeat("Nicola", SeatClass.BUSINESS_CLASS);
    flight.reserveSeat("Fred", SeatClass.FIRST_CLASS);

    flight.displayPassengerList();

    flight.cancelReservation("gert");
    flight.displayPassengerList();

    double totalRevenue = flight.ticketRevenueTotal();
    System.out.printf("Total ticket revenue: $%.2f%n", totalRevenue);
  }
}
