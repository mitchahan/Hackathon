/**
 * Created by Mitch Hansen on 3/3/2018.
 */
import java.util.*;
import com.google.android.gms.*;
import com.google.android.gms.maps.MapView;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.*;
import android.view.*;
import android.R.*;

public class main {
    private Map<Pantry, Integer> theMap;
    private static double long_;
    private static double lat_;


    public static void main(String[] args) {
        locInit();
        Needy n = new Needy();
        n.setLong(long_);
        n.setLat(lat_);
        ArrayList<Pantry> p;
        p = new ArrayList<>();
        Pantry testPantry = new Pantry(37.352529, -121.943594);
        p.add(testPantry);

        Map<Pantry, Integer> scoreList = scoreC(p, n);


    }

    public static void locInit() {
        long_ = 37.349850;
        lat_ = -121.939427;
    }


    public static Map<Pantry, Integer> scoreC(ArrayList<Pantry> p, Needy n) {


        //double currLongitutde = n.getLong(); //TODO lat and currLongitude
        //double currLatitude = n.getLat();


        for(int x = 0; x < p.size(); ++x){ //iterate thru pantries
            int score = 0;
        /*
        * 1) calculate distance
        * 2) cross reference supplies
        */
            double distance;
            distance = Math.sqrt(Math.pow(2, p.get(x).getLat()) - Math.pow(2, p.get(x).getLong()));
            score = 20 - (int) distance^2;

            if (p.get(x).getFood() > 0 && n.getF()) {
                score += 2;
            }

            if (p.get(x).getWater() > 0 && n.getW()) {
                score += 2;
            }

            if (p.get(x).getClothing() > 0 && n.getC()) {
                score += 2;
            }

            if (p.get(x).getMedicine() > 0 && n.getM()) {
                score += 2;
            }

            
            MapView map = (MapView) findViewById(R.id.mapView);
            
            //map.put(p.get(x), score);
            map.
        }
        return map;
    }
}
