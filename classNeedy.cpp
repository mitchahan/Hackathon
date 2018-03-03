#include <iostream>
using namespace std;

class Needy{
  public:
  Needy(long_ = 0, lat_ = 0, food_ = 0, clothes_ = 0, water_ = 0, medicine = 0);
  
  void setLong(double _long){_long = long_;}
  void setLat(double _lat){_lat = lat_;}
  void setFood(bool _food){_food = food_;}
  void setClothes(bool _clothes){_clothes = clothes_;}
  void setWater(bool _water){_water = water_;}
  void setMedicine(bool _medicine){_medicine= medicine_;}
  
  double getLong{return long_;}
  double getLat{return lat_;}
  bool getFood{return food_;}
  bool getClothes{return clothes_;}
  bool getWater{return water_;}
  bool getMedicine{return medicine_;}
  
  private:
  double long_;
  double lat_;
  bool food_;
  bool clothes_;
  bool medicine_;
  //bool medicine;
};