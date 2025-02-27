package powerpackage;
import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void one_power_one_is_one() {
        powerpackage.powerfinder PowerFinder = null;
        assert PowerFinder.findPower(1,1) == 1;
    }

    @Test
    public void two_power_one_is_two() {
        powerpackage.powerfinder PowerFinder = null;
        assert PowerFinder.findPower(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        powerpackage.powerfinder PowerFinder = null;
        assert PowerFinder.findPower(2, 2) == 4;
    }

    @Test
    public void three_power_two_is_nine() {
        powerpackage.powerfinder PowerFinder = null;
        assert PowerFinder.findPower(3, 2) == 3*3;
    }
}