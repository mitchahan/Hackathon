
/**
 * Created by Mitch Hansen on 3/3/2018.
 */

public class Needy {
    private double long_, lat_;
    private boolean food_, clothing_, medicine_, water_;

    public Needy() {
        long_ = 0;
        lat_ = 0;
        food_ = false;
        clothing_ = false;
        water_ = false;
        medicine_ = false;
    }

    public void setLong(double l) {
        long_ = l;
    }

    public void setLat(double l) {
        lat_ = l;
    }

    public void setFood(boolean f) {
        food_ = f;
    }

    public void setClothes(boolean c) {
        clothing_ = c;
    }

    public void setWater(boolean w) {
        water_ = w;
    }

    public void setMedicine(boolean m) {
        medicine_ = m;
    }

    double getLong() {return long_;}
    double getLat() {return lat_;}
    boolean getF() {return food_;}
    boolean getC() {return clothing_;}
    boolean getW() {return water_;}
    boolean getM() {return medicine_;}
}
