#include "menu.h"
#include <string>

// Default constructor
menu::menu() : Name(""), family(""), OSBArray(initializeOSBArray()) {}

// Parameterized constructor
menu::menu(const std::string& name, const std::string& family, std::array<osb, 20> OSBArray)
    : Name(name), family(family), OSBArray(OSBArray) {}

// Getters
std::string menu::getName() const { return Name; }
std::string menu::getFamily() const { return family; }
std::array<osb, 20> menu::getOSBs() const { return OSBArray; }

// Setters
void menu::setName(const std::string& newName) { Name = newName; }
void menu::setFamily(const std::string& newFamily) { family = newFamily; }

// Function to initialize and return an array of 20 osb objects
std::array<osb, 20> menu::initializeOSBArray() {
    std::array<osb, 20> osbArray;
    for (int i = 0; i < 20; ++i) {
        osbArray[i] = osb(i, "NULL" + std::to_string(i));
    }
    return osbArray;
}
