def isPalindrome(s):
    """
    :type s: str
    :rtype: bool
    """

    cleaned_s = ''
    for c in s:
        if c.isalnum():
            cleaned_s += c
    cleaned_s = cleaned_s.lower()
    return cleaned_s == cleaned_s[::-1]

print(isPalindrome('po P'))