def reverseString(s) -> None:
    """
    Do not return anything, modify s in-place instead.
    """

    # s.reverse()

    for b in range(int(len(s)/2)):
        e = len(s) - 1 - b
        t = s[b]
        s[b] = s[e]
        s[e] = t

s = ["H", "e", "l", "l", "o"]
reverseString(s)
print(s)