enum SeatClass {
    FIRST_CLASS(499.0),
    BUSINESS_CLASS(259.0),
    ECONOMY_CLASS(120.0);

    private final double price;

    SeatClass(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}