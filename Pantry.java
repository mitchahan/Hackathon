/**
 * Created by Mitch Hansen on 3/3/2018.
 */
import java.io.*;
import java.util.*;
//import Database.java;

public class Pantry {
    private double lat_;
    private double long_;
    protected Map<String, Integer> data_;
    private Scanner in;

    public Pantry() {
        lat_ = 0;
        long_ = 0;
        try {
            in = new Scanner(new File("supplies.txt"));
        } catch(Exception e) {
            System.out.print("ThAt FiLe D0eSn'T Ex1St");
        }
        int i=0;
        while (in.hasNext()) {
            data_.put(in.nextLine(), i);
            i++;
        }
        in.close();

    }

    public Pantry(double l, double lo) {
        lat_ = l;
        long_ = lo;
        try {
            in = new Scanner(new File("supplies.txt"));
        } catch(Exception e) {
            System.out.print("ThAt FiLe D0eSn'T Ex1St");
        }
        int i=0;
        while (in.hasNext()) {
            data_.put(in.nextLine(), i);
            i++;
        }
        in.close();
    }

    public double getLong() {
        return long_;
    }
    public double getLat() {
        return lat_;
    }
    public int getFood() {
        int count = 0;
        for (Map.Entry<String, Integer> entry: data_.entrySet()) {
            if (entry.getKey() == "Food") {
                count++;
            }
            //cout every element
        }
        return count;
    }
    public int getWater() {
        int count = 0;
        for (Map.Entry<String, Integer> entry: data_.entrySet()) {
            if (entry.getKey() == "Water") {
                count++;
            }
            //cout every element
        }
        return count;
    }
    public int getClothing() {
        int count = 0;
        for (Map.Entry<String, Integer> entry: data_.entrySet()) {
            if (entry.getKey() == "Clothing") {
                count++;
            }
            //cout every element
        }
        return count;
    }
    public int getMedicine() {
        int count = 0;
        for (Map.Entry<String, Integer> entry: data_.entrySet()) {
            if (entry.getKey() == "Medicine") {
                count++;
            }
        }
        return count;
    }
    public void print() {
        for (Map.Entry<String, Integer> entry: data_.entrySet()) {
            //cout every element
        }
    }

}
