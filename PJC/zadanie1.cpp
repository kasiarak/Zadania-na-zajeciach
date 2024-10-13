#include "zadanie1.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void zadanie1() {
        auto words = std::vector<std::string>{
            "a", "quick", "brown", "fox"
        };

        std::ranges::sort(words);
        std::ranges::reverse(words);

        std::cout << words.back() << '\n';
        std::cout << words.front().front();
}
