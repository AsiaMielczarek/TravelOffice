package pl.traveloffice;

import java.math.BigDecimal;

public class DomesticTrip extends Trip {

    private BigDecimal ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, BigDecimal price, BigDecimal ownArrivalDiscount) {
        super(start, end, destination, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(BigDecimal ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(ownArrivalDiscount);
    }
}
