public class Passenger {
    private String passengerName;
    private SeatClass seatClass;
    private double ticketPrice;

    public Passenger(String passengerName, SeatClass seatClass){
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
        return "Passenger{" +
                "passengerName='" + passengerName + '\'' +
                ", seatClass=" + seatClass +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Passenger p = (Passenger) obj;
        return this.getPassengerName().equalsIgnoreCase(p.getPassengerName());
    }
}
