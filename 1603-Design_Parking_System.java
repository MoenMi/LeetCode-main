class ParkingSystem {
    
    private int b, m, s, bMAX, mMAX, sMAX;

    public ParkingSystem(int big, int medium, int small) {
        bMAX = big;
        mMAX = medium;
        sMAX = small;
        b = m = s = 0;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && b < bMAX) {
            b++;
            return true;
        }
        if (carType == 2 && m < mMAX) {
            m++;
            return true;
        }
        if (carType == 3 && s < sMAX) {
            s++;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
