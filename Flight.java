import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Flight {

private List<Passenger> passengerList;
private List<Seat> seats;
private int businessSeats = 0;
private int firstClassSeats = 0;
private int economySeats = 0;

public Flight(){
    this.passengerList = new ArrayList<>();
    this.seats = fillFlight();
}

public Flight(List<Seat> seats){
    this.passengerList = new ArrayList<>();
    this.seats = seats;
    setNumberOfSeats(seats);
}

private List<Seat> fillFlight(){
    List<Seat> seats = new ArrayList<>();

    for(int i = 1; i < 31; i++){
        seats.add(new Seat(i, SeatClass.BUSINESS_CLASS));
    }
    this.businessSeats = 30;
    for(int i = 31; i < 71; i++){
        seats.add(new Seat(i, SeatClass.FIRST_CLASS));
    }
    this.firstClassSeats = 40;
    for(int i = 71; i < 141; i++){
        seats.add(new Seat(i, SeatClass.ECONOMY_CLASS));
    }
    this.economySeats = 70;
    return seats;
}
private void setNumberOfSeats(List<Seat> seats){
    for(Seat seat: seats){
        switch (seat.getSeatClass()){
            case BUSINESS_CLASS -> businessSeats++;
            case FIRST_CLASS -> firstClassSeats++;
            case ECONOMY_CLASS -> economySeats++;
        }
    }
}
private boolean isPassengerExist(Passenger passenger){
    for(Passenger p : passengerList){
        if(p.equals(passenger)){
            return true;
        }
    }
    return false;
}

private boolean isPassengerExist(String name){
       return findPassengerByName(name) != null ? true : false;
}

private Passenger findPassengerByName(String name){
    for(Passenger passenger : passengerList){
        if(passenger.getPassengerName().equalsIgnoreCase(name)){
            return passenger;
        }
    }
    return null;
}
private Seat findSeat(SeatClass seatClass, boolean isFree){
    int i;
    int end;
    switch(seatClass){
        case BUSINESS_CLASS -> {
            i = 1;
            end = i + businessSeats;
        }
        case FIRST_CLASS -> {
            i = businessSeats + 1;
            end = i + firstClassSeats;
        }
        default -> {
            i = businessSeats + firstClassSeats + 1;
            end = seats.size() + 1;
        }
    }
    for(int j = i; j <end; j++){
        if(isFree ? !seats.get(j).isReserved() : seats.get(j).isReserved())  //find free or reserved seat
        {
            return seats.get(j);
        }
    }
    return null;
}

public boolean reserveSeat(Passenger passenger){
    if(isPassengerExist(passenger)){
        return false;       //passenger already booked the seat
    }
    passengerList.add(passenger);
    Seat posibleSeat = findSeat(passenger.getSeatClass(), true);
    if(posibleSeat != null){
        posibleSeat.setReserved(true);
        return true;
    }
    return false;
}

public boolean cancelReservation(String passengerName){
    if(!isPassengerExist(passengerName)){
        return false;
    }
    SeatClass seatClass = findPassengerByName(passengerName).getSeatClass();
    Seat posibleSeat = findSeat(seatClass, false);
    if(posibleSeat != null){
        posibleSeat.setReserved(false);
        passengerList.remove(findPassengerByName(passengerName));
        return true;
    }
    return false;
}

public void displayPassengerList(){
    System.out.println("List of passengers: ");
    for(Passenger passenger : passengerList){
        System.out.println(passenger);
    }
    System.out.println("-------------------------------------------------");
    System.out.println();
}

public double calculateTotalRevenue(){

   return passengerList.stream()
            .mapToDouble(p -> p.getTicketPrice())
            .sum();

}

}
