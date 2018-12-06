package pl.traveloffice;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        Customer customer1 = new Customer("Asia");
        Address address1 = new Address("Kościuszki", "90-050", "Łódź");
        customer1.setAddress(address1);
        Trip trip1 = new AbroadTrip(new Date(2019, 10, 01), new Date(2019, 10, 20), "Bali", new BigDecimal(3500), new BigDecimal(299));
        customer1.assignTrip(trip1);

        Customer customer2 = new Customer("Bartek");
        Address address2 = new Address("Piotrkowska", "90-111", "Łódź");
        customer2.setAddress(address2);
        Trip trip2 = new AbroadTrip(new Date(2019, 5, 9), new Date(2019, 5, 15), "Paris", new BigDecimal(1349), new BigDecimal(150));
        customer2.assignTrip(trip2);

        Customer customer3 = new Customer("Mokka");
        Address address3 = new Address("Politechniki", "93-411", "Łódź");
        customer3.setAddress(address3);
        Trip trip3 = new DomesticTrip(new Date(2018, 12, 9), new Date(2018, 12, 20), "Wrocław", new BigDecimal(1999), new BigDecimal(199));
        customer3.assignTrip(trip3);

        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer2);
        travelOffice.addCustomer(customer3);

        System.out.println(travelOffice.getInfo());
        System.out.println(travelOffice.getInfo1());
        System.out.println(travelOffice.toString());
    }
}

