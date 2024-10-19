#include "guessNumber.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void isPrime(int x) {
    bool isPrime = true;
    if(x==1) isPrime = false;
    else for(int i = 2; i < x; i++) {
        if(x%i == 0) isPrime = false;
    }
    if(isPrime) std::cout << "Argument jest liczba pierwsza";
    else std::cout << "Argument nie jest liczba pierwsza";
}