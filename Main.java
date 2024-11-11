class Main{
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.displayPassengerList();
        System.out.println("Total revenue = " + flight.calculateTotalRevenue() + "$");

        flight.reserveSeat(new Passenger("John Black", SeatClass.BUSINESS_CLASS));
        flight.reserveSeat(new Passenger("Jenny", SeatClass.BUSINESS_CLASS));
        flight.reserveSeat(new Passenger("Michael Brown", SeatClass.ECONOMY_CLASS));
        flight.reserveSeat(new Passenger("Julia", SeatClass.FIRST_CLASS));

        flight.displayPassengerList();
        System.out.println("Total revenue = " + flight.calculateTotalRevenue() + "$");

        flight.cancelReservation("JOHn Black");
        flight.displayPassengerList();
        System.out.println("Total revenue = " + flight.calculateTotalRevenue() + "$");

       flight.reserveSeat(new Passenger("Julia", SeatClass.FIRST_CLASS));
       flight.displayPassengerList();
        System.out.println("Total revenue = " + flight.calculateTotalRevenue() + "$");

       flight.cancelReservation("julia");
        flight.displayPassengerList();
        System.out.println("Total revenue = " + flight.calculateTotalRevenue() + "$");
    }
}
