class Passenger {
    private final String passengerName;
    private final SeatClass seatClass;
    private final double ticketPrice;

    public Passenger(String passengerName, SeatClass seatClass) {
        this.passengerName = passengerName;
        this.seatClass = seatClass;
        this.ticketPrice = seatClass.getPrice();
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
        return "Passenger Name: " + passengerName + ", Seat Class: " + seatClass + ", Ticket Price: " + ticketPrice;
    }
}