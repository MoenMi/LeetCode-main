class Solution(object):

    results = []
    indices = []
    directory = []

    def _init_(self):
        pass

    def stringCreator(self, i, s):
        if i >= len(self.indices):
            self.results.append(s)
        else:
            for letter in self.directory[self.indices[i]]:
                self.stringCreator(i+1, s+letter)

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        self.directory = [['a', 'b', 'c'],
            ['d', 'e', 'f'],
            ['g', 'h', 'i'],
            ['j', 'k', 'l'],
            ['m', 'n', 'o'],
            ['p', 'q', 'r', 's'],
            ['t', 'u', 'v'],
            ['w', 'x', 'y', 'z']]
        self.results = []
        self.indices = []

        if len(digits) == 0:
            return self.results

        for i in range(len(digits)):
            self.indices.append(int(digits[i]) - 2)

        self.stringCreator(0, '')

        return self.results
