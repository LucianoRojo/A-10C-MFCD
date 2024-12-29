#ifndef OSB_H
#define OSB_H

#include <string>

class osb
{
public:
    // Default constructor
    osb();

    // Parameterized constructor
    osb(const int Number, const std::string& function);

    // Getters
    int get_number() const;
    std::string get_function() const;

    // Setters
    void set_number(const int newNumber);
    void set_function(const int number, const std::string& newFunction);

private:
    int Number;
    std::string function;
};

#endif // OSB_H
