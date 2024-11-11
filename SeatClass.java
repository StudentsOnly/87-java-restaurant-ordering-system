public enum SeatClass {
    FIRST_CLASS(300), BUSINESS_CLASS(450), ECONOMY_CLASS(120);

    private double price;

    SeatClass(double price){
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
