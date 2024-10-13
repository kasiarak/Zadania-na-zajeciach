#include "zadanie2.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void zadanie2() {
    std::cout << "Wpisz pierwszy wyraz" << std::endl;
    auto wyraz1 = std::string();
    std::cin >> wyraz1;
    std::cout << "Wpisz drugi wyraz" << std::endl;
    auto wyraz2 = std::string();
    std::cin >> wyraz2;
    if(wyraz1.size()>wyraz2.size()) {
        std::cout << "Dluzszy wyraz: " << wyraz1;
    }else if(wyraz2.size()>wyraz1.size()) {
        std::cout << "Dluzszy wyraz: " << wyraz2;
    }else {
        std::cout << "Wyrazy sa takie same";
    }
}
