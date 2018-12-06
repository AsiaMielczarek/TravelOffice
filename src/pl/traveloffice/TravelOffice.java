package pl.traveloffice;

import java.util.*;

public class TravelOffice {

    // PO ZREFAKTOROWANIU
    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> tripMap = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getCustomerCount() {
        return customers.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            Customer c = iterator.next();
            if(c != null){
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public void addTrip(String name, Trip trip){
        tripMap.put(name, trip);
    }

    public boolean removeTrip(String name){
        if(tripMap.containsKey(name)){
            tripMap.remove(name);
            return true;
        }
        return false;
    }

    public Customer findCustomerByName(String name){
        Customer c = null;
        Iterator<Customer> iterator = customers.iterator();
        return c;
    }
}


//
// Dodaj do klasy TravelOffice metody do:
//         – dodawania wycieczki – void addTrip(String, Trip)
//         – usuwania wycieczki – boolean removeTrip(String)
//         – wyszukiwania klienta – Customer findCustomerByName(String)
//         – do usuwania klienta – boolean removeCustomer(Customer)
//         • Dodaj do klasy metody zwracające wszystkie wycieczki i wszystkich klientów
//         • Zablokuj możliwość tworzenia obiektów typu Trip – nie ma to sensu, od czasu, gdy nastąpiła
//         specjalizacja na wycieczki krajowe i zagraniczne


//    TABLICA DYNAMICZNA

//    private Customer[] customersTab = new Customer[2];
//    private int customerCount = 0;
//
//    public void addCustomer(Customer customer){
//        if(customerCount == customersTab.length) {
//            Customer[] newCustomerTab = new Customer[customersTab.length + 2];
//            System.arraycopy(customersTab, 0, newCustomerTab, 0, customersTab.length);
//            customersTab = newCustomerTab;
//        }
//        customersTab[customerCount++] = customer;
//    }
//
//    public int getCustomerCount(){
//        return customerCount;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < customersTab.length; i++) {
//            if(customersTab[i] != null){
//                sb.append(customersTab[i].toString()).append("\n");
//            }
//        }
//        return sb.toString();
//    }