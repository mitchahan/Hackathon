#include <iostream>
using namespace std;

class Needy{
  public:
  Needy(long_ = 0, lat_ = 0, food_ = 0, clothes_ = 0, water_ = 0, medicine = 0);
  
  void setLong(double _long){long_ = _long;}
  void setLat(double _lat){lat_ = _lat;}
  void setFood(bool _food){food_ = _food;}
  void setClothes(bool _clothing){clothing_ = _clothing;}
  void setWater(bool _water){water_ = _water;}
  void setMedicine(bool _medicine){medicine_ = _medicine;}
  
  double getLong{return long_;}
  double getLat{return lat_;}
  bool getFood{return food_;}
  bool getClothing{return clothing_;}
  bool getWater{return water_;}
  bool getMedicine{return medicine_;}
  
  private:
  double long_;
  double lat_;
  bool food_;
  bool clothing_;
  bool medicine_;
};
