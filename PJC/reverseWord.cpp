#include "reverseWord.h"
#include "zadanie2.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void reverseWord(std::string word) {
    std::string newWord = "";
    for(int i = 0; i < word.size(); i++) {
        newWord += word[word.size()-1-i];
    }
    std::cout << newWord;
}