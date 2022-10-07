import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Wendelin Spörk - 01618620
 **/

public class EinstiegsbeispielTest {

    @Test
    public void TestValidFunction1() {
        int[] binaryArray1 = {1, 0, 1, 1};
        int[] binaryArray2 = {1, 1, 0, 1, 1, 0};

        Assertions.assertEquals(11, Einstiegsbeispiel.binary2decimal(binaryArray1));
        Assertions.assertEquals(54, Einstiegsbeispiel.binary2decimal(binaryArray2));

    }

    @Test
    public void TestVaildFunction2() {
        int[] binaryArray3 = {0};
        int[] binaryArray4 = {1};
        Assertions.assertEquals(0, Einstiegsbeispiel.binary2decimal(binaryArray3));
        Assertions.assertEquals(1, Einstiegsbeispiel.binary2decimal(binaryArray4));

    }

    @Test
    public void TestFailureFunction1() {
        int [] binaryArrray5 = {1, 2};
        Assertions.assertEquals(-1, Einstiegsbeispiel.binary2decimal(binaryArrray5));
    }

    @Test
    public void TestFailureFunction2() {

    }


}
