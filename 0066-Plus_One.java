class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        for (int i = digits.length-1; i >= 0; i--) {
            if (carry) digits[i] += 1;
            if (digits[i] > 9) {
                digits[i] = 0;
                carry = true;
            } else {
                carry = false;
            }
        }
        if (carry) {
            int arr[] = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
        return digits;        
    }
}
