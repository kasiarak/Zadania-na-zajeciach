#include "reverseWord.h"
#include "zadanie2.h"
#include <iostream>
#include <vector>
#include <string>
#include <fmt/base.h>
#include <fmt/ranges.h>
#include <algorithm>

void reverseWords() {
    auto words = std::string();
    std::cout << "Podaj zdanie do odwrocenia" << std::endl;
    std::getline(std::cin, words);
    std::string newwords = "";
    std::string word = "";
    for(int i = 0; i < words.size(); i++) {
        if(words[words.size()-1-i] == ' ' || i == words.size()-1) {
            std::string newWord = "";
            for(int i = 0; i < word.size(); i++) {
                newWord += word[word.size()-1-i];
            }
            newwords += newWord;
            newwords += " ";
            word = "";
        }else {
            word += words[words.size()-1-i];
        }
    }
    std::cout << newwords;
}