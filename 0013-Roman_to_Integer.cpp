#include <string>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.at(i) == 'V') num += 5;
            if (s.at(i) == 'L') num += 50;
            if (s.at(i) == 'D') num += 500;
            if (s.at(i) == 'M') num += 1000;
            
            if (s.at(i) == 'I') {
                if (i == s.length()-1) {
                    num += 1;
                } else if (s.at(i+1) == 'V' || s.at(i+1) == 'X') {
                    num -= 1;
                } else {
                    num += 1;
                }
            }
            
            if (s.at(i) == 'X') {
                if (i == s.length()-1) {
                    num += 10;
                } else if (s.at(i+1) == 'L' || s.at(i+1) == 'C') {
                    num -= 10;
                } else {
                    num += 10;
                }
            }
            
            if (s.at(i) == 'C') {
                if (i == s.length()-1) {
                    num += 100;
                } else if (s.at(i+1) == 'D' || s.at(i+1) == 'M') {
                    num -= 100;
                } else {
                    num += 100;
                }
            }
            
        }
        return num;
    }
};
