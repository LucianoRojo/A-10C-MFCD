#include "osb.h"
#include <string>

// Default constructor
osb::osb() : Number(0), function("NULL") {}

// Parameterized constructor
osb::osb(const int Number, const std::string& function) : Number(Number), function(function) {}

// Getters
int osb::get_number() const { return Number; }
std::string osb::get_function() const { return function; }

// Setters
void osb::set_number(const int newNumber) { Number = newNumber; }
void osb::set_function(const int number, const std::string& newFunction) {
    if (Number == number) {
        function = newFunction;
    }
}
