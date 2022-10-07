import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Wendelin Spörk - 01618620
 **/

public class EinstiegsbeispielTest {

    @Test
    public void TestValid1 (){
        int [] binaryArray1 = {1, 0, 1, 1};
        int [] binaryArray2 = {1, 1, 0, 1, 1, 0};

        Assertions.assertEquals(11, Einstiegsbeispiel.binary2decimal(binaryArray1));
        Assertions.assertEquals(54, Einstiegsbeispiel.binary2decimal(binaryArray2));

    }




}
