/**
 * Created by Mitch Hansen on 3/3/2018.
 */
import java.util.*;

public class main {
    private Map<Pantry, Integer> theMap;

    public static void main(String[] args) {

    }

    public void scoreC(ArrayList<Pantry> p, Needy n) {


        double currLongitutde = n.getLong(); //TODO lat and currLongitutde
        double currLatitude = n.getLat();


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
            theMap.put(p.get(x), score);
        }
    }
}
