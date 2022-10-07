import java.util.Scanner;

/**
 * Wendelin Spörk - 01618620
 **/

public class Einstiegsbeispiel {

    public static int binary2decimal(int[] binaryArray) {
        int dezimal = 0;
        int potenz = 1;

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            dezimal = dezimal + binaryArray[i] * potenz;
            potenz = potenz * 2;
        }
        return dezimal;
    }

}