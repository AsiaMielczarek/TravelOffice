package pl.traveloffice;

public class Date {

    private String date;

    public Date(String date) {
        this.date = date;
    }

    public static String setDate(String date, String separator){
        String[] splitted = date.split(separator);
        return new java.util.Date(Integer.valueOf(splitted[0]), Integer.valueOf(splitted[1]), Integer.valueOf(splitted[2])).toString();
    }
}

//    private int year;
//    private int month;
//    private int day;
//
//    public Date(int year, int month, int day){
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }

//    @Override
//    public String toString(){
//      return year + "/" + month + "/" + day;
//    }

// STRING TO DATE METHOD
//    public static java.util.Date setDate(String date){
//        String splitted = date.replaceAll("\\D", "/");
//        java.util.Date dateO = new java.util.Date();
//        try {
//            dateO = new SimpleDateFormat("dd/MM/yyyy").parse(splitted);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return dateO;
//    }