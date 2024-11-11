public class Seat {
    private int number;
    private boolean isReserved;
    private SeatClass seatClass;

    public Seat(int number, boolean isReserved, SeatClass seatClass){
        this.number = number;
        this.isReserved = isReserved;
        this.seatClass = seatClass;
    }

    public Seat(int number, SeatClass seatClass){
        this.number = number;
        this.isReserved = false;
        this.seatClass = seatClass;
    }

    public int getNumber() {
        return number;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    private boolean reserve(){
        if(isReserved){
            return false;
        }else{
            setReserved(true);
            return true;
        }
    }

    public boolean cancelReservation(){
        if(!isReserved){
            return false;
        }else{
            setReserved(false);
            return true;
        }
    }
}
