cmake_minimum_required(VERSION 3.29)
project(PJC)

set(CMAKE_CXX_STANDARD 20)

include(FetchContent)

FetchContent_Declare(
        fmt
        GIT_REPOSITORY https://github.com/fmtlib/fmt
        GIT_TAG 11.0.2
)

FetchContent_MakeAvailable(fmt)

add_executable(PJC main.cpp
        zadanie1.cpp
        zadanie1.h
        zadanie2.cpp
        zadanie2.h
        reverseWord.cpp
        reverseWord.h
        reverseWords.cpp
        reverseWords.h
        guessNumber.cpp
        guessNumber.h
        isPrime.cpp
        isPrime.h)
target_link_libraries(PJC fmt)
