package powerpackage;

public class powerfinder {
    public static int findPower(int base, int index) {
        int res = 1;
        for (int i = 0; i<index; i++) {
            res *= base;
        }
        return res;
    }
}