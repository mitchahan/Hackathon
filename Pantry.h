#ifndef PANTRY_H
#define PANTRY_H

#include <iostream>
#include <map>

class Pantry
{
public:
	Pantry();
	double getLat() const;
	double getLong() const;
	int getFood() const;
	int getWater() const;
	int getClothing() const;
	int getMedicine() const;
	void print() const;
private:
	std::map<std::string, int> data_;
	double lat_;
	double long_;
};
#endif PANTRY_H