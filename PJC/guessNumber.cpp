#include "guessNumber.h"
#include "zadanie2.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>
#include <cstdlib>
#include <ctime>

void guessNumber() {
    std::srand(static_cast<unsigned int>(std::time(0)));
    int randomNumber = std::rand() % 100 + 1;
    std::cout << "Zgadnij liczbe od 1 do 100" << std::endl;
    auto guessedNumber = int();
    std:: cin >> guessedNumber;
    while(guessedNumber != randomNumber) {
        if(guessedNumber>randomNumber) {
            std::cout<< "Za duzo, sprobuj ponownie" << std::endl;
        }else {
            std::cout << "Za malo, sprobuj ponownie" << std::endl;
        }
        std::cin >> guessedNumber;
    }
    std::cout << "Tak! Szukana liczba to " << randomNumber;
}