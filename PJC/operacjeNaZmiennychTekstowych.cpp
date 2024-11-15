#include "operacjeNaZmiennychTekstowych.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void operacjeNaZmiennychTekstowych() {
    std::cout << "Podaj slowo" << std::endl;
    auto slowo = std::string();
    std::cin >> slowo;
    std::cout << slowo[0] << std::endl;
    std::cout << "'" << slowo[slowo.size()-1] << "'" << std::endl;
    std::cout << slowo.size() << std::endl;
    std::cout << "\"" << slowo[slowo.size()/2] << "\"" << std::endl;
    std::cout << "[" << slowo << "]" << std::endl;
    auto vec = std::vector<char>();
    for(int i = 0; i < slowo.size(); i++) {
        vec.push_back(slowo[i]);
    }
    std::ranges::sort(vec);
    for(char i : vec) {
        std::cout << i;
    }
}