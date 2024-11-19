#include "analizaGrupyStudenckiej.h"
#include <algorithm>
#include <vector>
#include <iostream>
#include <string>
#include <set>
#include <map>
#include <fmt/ranges.h>
#include <fmt/format.h>

struct Student {
    std::string name;
    std::string surname;
    int index;
    int semester;
};

auto format_as(Student const& s) -> std::string {
    return fmt::format("{} {} {} {}", s.name, s.surname, s.index, s.semester);
}

auto allOnSameSemester(std::vector<Student> const& students) -> bool {
    auto const semester = students.front().semester;

    return std::ranges::all_of(
        students, [semester](Student const& s) { return s.semester == semester; }
    );
}

enum class SortingCriteria {
    Name, Surname, Index, Semester
};

auto sort(std::vector<Student>& students, SortingCriteria const criteria) -> void {
    std::ranges::sort(students, [criteria](Student const& left, Student const& right) {
         switch (criteria) {
             case SortingCriteria::Name: return left.name < right.name;
             case SortingCriteria::Surname: return left.surname < right.surname;
             case SortingCriteria::Index: return left.index < right.index;
             case SortingCriteria::Semester: return left.semester < right.semester;
         }
    });
}

