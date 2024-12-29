#ifndef MENU_H
#define MENU_H

#include "osb.h"
#include <string>
#include <vector>
#include <array>

class menu
{
public:
    menu();
    // Parameterized constructor
    menu(const std::string& name, const std::string& family, std::array<osb, 20> OSBArray);

    // Getters
    std::string getName() const;
    std::string getFamily() const;
    std::array<osb, 20> getOSBs() const;

    // Setters
    void setName(const std::string& newName);
    void setFamily(const std::string& newFamily);
    std::array<osb, 20> initializeOSBArray();

private:
    std::string Name;
    std::string family;
    std::array<osb, 20> OSBArray;
};

#endif // MENU_H
