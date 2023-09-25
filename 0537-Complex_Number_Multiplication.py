def complexNumberMultiply(num1, num2):
    """
    :type num1: str
    :type num2: str
    :rtype: str
    """

    num1 = num1.split('+')
    num2 = num2.split('+')

    real1 = int(num1[0])
    real2 = int(num2[0])

    im1 = int(num1[1][:-1])
    im2 = int(num2[1][:-1])

    return f'{(real1*real2) - (im1*im2)}+{(real1*im2) + (real2*im1)}i'

print(complexNumberMultiply('1+-8i', '0+5i'))