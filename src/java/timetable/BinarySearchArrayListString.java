/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Search element in array using Binary Search
 * 
 * @author Java Honk
 * 
 */
public class BinarySearchArrayListString {

    private final static int NOT_FOUND = -1;

    public static void main(String[] args) {

        List<String> integerList = new ArrayList<String>();
        integerList.add("Dennis");
        integerList.add("peter");
        integerList.add("charles");
        integerList.add("michael");
        integerList.add("wakahe");
        integerList.add("wanja");
        integerList.add("makamu");
        integerList.add("muthoni");

        Collections.sort(integerList);

        int value = binarySearch(integerList, "muthoni");

        if (value == -1) {
            System.out.println("Search value not found");
        } else {
            System.out.println("Search value position: " + value);
        }

    }

    /**
     * @param number
     * @param searchValue
     * @return
     */
    public static int binarySearch(List<String> integerList, String searchValue) {

        int low = 0;
        int high = integerList.size() - 1;
        int mid = (low + high) / 2;

        while (low <= high && !integerList.get(mid).equalsIgnoreCase(searchValue)) {

            if (integerList.get(mid).compareTo(searchValue) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;

            if (low > high) {
                mid = NOT_FOUND;
            }

        }
        return mid;

    }

}