#include "Pantry.h"
#include <iostream>
#include <fstream>

Pantry::Pantry()
{
	std::ifstream inFile;
	inFile.open("input1.txt");
	std::map<std::string, int> data_;
	//Reading through file, putting in map
	std::string temp;
	while(getline(inFile, temp))
	{
		data_[temp]++;
	}
	inFile.close();
}
double Pantry::getLat() const
{
	return lat_;
}
double Pantry::getLong() const
{
	return long_;
}
void Pantry::print() const
{
	for (auto e:data_)
	{
		std::cout << e.first << std::endl;
	}
}
int Pantry::getFood() const
{
	int foodCount;
	for (auto e : data_)
	{
		if (e.first == "food")
			foodCount++;
	}
	return foodCount;
}
int Pantry::getWater() const
{
	int waterCount;
	for (auto e : data_)
	{
		if (e.first == "food")
			waterCount++;
	}
	return waterCount;
}
int Pantry::getClothing() const
{
	int clothingCount;
	for (auto e : data_)
	{
		if (e.first == "food")
			clothingCount++;
	}
	return clothingCount;
}
int Pantry::getMedicine() const
{
	int medCount;
	for (auto e : data_)
	{
		if (e.first == "food")
			medCount++;
	}
	return medCount;
}