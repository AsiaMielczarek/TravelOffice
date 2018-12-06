package pl.traveloffice;

import java.math.BigDecimal;

public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private BigDecimal price;

    public Trip(Date start, Date end, String destination, BigDecimal price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
    }

    public BigDecimal getPrice() { return price; }

    public void setPrice(BigDecimal price) { this.price = price; }

    @Override
    public String toString(){
        return "from: " + start.toString() + " to: " + end.toString() + ", destination: " + destination + ", price: " + getPrice();
    }
}

