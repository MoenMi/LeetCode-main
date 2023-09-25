class Solution {
    public String defangIPaddr(String address) {
        String defangedIP = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defangedIP += "[.]";
            } else {
                defangedIP += address.charAt(i);
            }
        }
        return defangedIP;
    }
}
