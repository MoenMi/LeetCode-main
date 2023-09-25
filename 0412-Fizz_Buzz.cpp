#include <string>
using namespace std;

class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> answer;
        string toAdd = "";
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) toAdd += "Fizz";
            if (i%5 == 0) toAdd += "Buzz";
            if (toAdd == "") toAdd += i;
            
            answer.push_back(toAdd);
        }
        return answer;
    }
};
