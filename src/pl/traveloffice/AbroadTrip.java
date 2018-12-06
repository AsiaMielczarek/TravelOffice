package pl.traveloffice;

import java.math.BigDecimal;

public class AbroadTrip extends Trip {

    private BigDecimal insurance;

    public AbroadTrip(Date start, Date end, String destination, BigDecimal price, BigDecimal insurance) {
        super(start, end, destination, price);
        this.insurance = insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(insurance);
    }
}
