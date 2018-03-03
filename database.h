#ifndef DATABASE_H
#define DATABASE_H

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

class Database{
public:
    Database(Pantry p);
    
private:
    std::vector<Pantry> data_;
}

#endif
