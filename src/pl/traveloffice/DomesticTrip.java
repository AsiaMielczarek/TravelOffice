package pl.traveloffice;

import java.math.BigDecimal;

public class DomesticTrip extends Trip {

    private BigDecimal ownArrivalDiscount;

    public DomesticTrip(String start, String end, String destination) {
        super(start, end, destination);
    }

    public void setOwnArrivalDiscount(BigDecimal ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(ownArrivalDiscount);
    }
}
