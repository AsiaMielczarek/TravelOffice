package pl.traveloffice;

import java.util.regex.Pattern;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void setDate(int year, int month, int day){
        String dateFromClass = year + String.valueOf(month) + day;
        Pattern p = Pattern.compile(" ");
        java.util.Date date = new java.util.Date();

    }

    @Override
    public String toString(){
        return year + "/" + month + "/" + day;
    }
}


//
//    CELE I ZADANIA:
//        • Napisz w klasie Date metodę umożliwiającą utworzenie obiektu daty na podstawie jego postaci
//        tekstowej
//        • Dopuść różne postaci separatorów
//        ALGORYTM WYKONANIA:
//        • Utwórz w klasie Date metodę statyczną, która na podstawie podanego tekstu oraz separatora utworzy obiekt daty
//        • Wykorzystaj dowolny z przedstawionych na prezentacji mechanizmów podziału tekstu na tokeny
//        • Sprawdź działanie utworzonej metody