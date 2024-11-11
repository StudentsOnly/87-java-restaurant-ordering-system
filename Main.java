public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.reserveSeat("Steve Tyler", SeatClass.FIRST_CLASS);
        flight.reserveSeat("Klaus Meine", SeatClass.BUSINESS_CLASS);
        flight.reserveSeat("Alice Cooper", SeatClass.ECONOMY_CLASS);

        System.out.println();
        System.out.println("Passenger List:");
        flight.displayPassengerList();

        System.out.println();
        System.out.println("Cancel reservation for Klaus Meine");
        flight.cancelReservation("Klaus Meine");


        System.out.println();
        System.out.println("Updated Passenger List:");
        flight.displayPassengerList();


        double totalRevenue = flight.calculateTotalRevenue();
        System.out.println();
        System.out.println("Total Revenue: " + totalRevenue);
    }
}
