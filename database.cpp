#include "database.h"
#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <algorithm>

Database::Database(Pantry p){
        data_.push_back(std::pair<Pantry, int>(p, 0));
}
void Database::sort(Needy j){
    
    //distance formula
    currLongitutde = j.getLongitude(); //TODO lat and currLongitutde
    currLatitude = j.getLatitude();
    
    for(auto e:data_){ //iterate thru pantries

    /* 
     * 1) calculate distance
     * 2) cross reference supplies
     */
        double distance;
        distance = sqrt((e.getLatitude()-currLatitude)^2 + (e.getLongitude() - currLongitutde)^2)
        score = 20 - distance^2;
        
        if(e.getFood() > 0 && j.getFood()){
            score += 2;
        }
        
        if(e.getWater() > 0 && j.getWater()){
            score += 2;
        }
        if(e.getClothing() > 0 && j.getClothing()){
            score += 2;
        }
        if(e.getMedicine() > 0 && j.getMedicine()){
            score += 2;
        }
    
        data_.back() += score;
    }
    sort(data_.rbegin(), data_.rend());
}