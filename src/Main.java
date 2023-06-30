//Define a testing class with a main() method where you:
//        create a Map called months where the key is the name of the month and value is the cardinal number of the month
//        populate the Map, being sure to preserve the insertion order
//        obtain and print a Set view of the keys that are in months using a specific Map method
//        then convert months using a Collection of integers:
//        into a List (and print it) of integers called cardinalMonth where you insert all the values of the Map
//        into an array (and print it) of integers called cardinalMonthArray where you insert all the values of the Map

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> months = new LinkedHashMap<>();
        months.put("january", 1);
        months.put("february", 2);
        months.put("march", 3);
        months.put("april", 4);
        months.put("may", 5);
        months.put("june", 6);
        months.put("july", 7);
        months.put("august", 8);
        months.put("september", 9);
        months.put("october", 10);
        months.put("november", 11);
        months.put("december", 12);

        for(String month : months.keySet()) {
            System.out.println(month);
        }

        System.out.println(" ");

        Collection<Integer> cardinalMonth = new ArrayList<>(months.values());

        for(int monthNumber : cardinalMonth) {
            System.out.println(monthNumber);
        }

        System.out.println(" ");

        // creo un nuovo array di Integer uguale ai value trasformati in array della map months
        // new Integer[0] serve a creare un nuovo array di Integer con una size iniziale di zero, quindi un array vuoto, in modo che il toArray poi va a creare un nuovo array delle dimensioni giuste
        Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
        // oppure posso fare: months.values().toArray(cardinalMonthArray); in cui recupero i value del Map month, li converto in array e li assegno a cardinalMonthArray

        for (Integer number : cardinalMonthArray) {
            System.out.printf(number + " ");
        }

    }
}