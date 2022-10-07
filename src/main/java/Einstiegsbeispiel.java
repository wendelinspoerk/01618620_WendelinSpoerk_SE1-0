import java.util.Scanner;

/**
 * Wendelin Spörk - 01618620
 **/

public class Einstiegsbeispiel {
    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 1, 0};
        BinaryToDecimal(binaryArray);

    }

    public static int BinaryToDecimal(int[] binaryArray) {
        int dezimal = 0;
        int potenz = 1;

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            dezimal = dezimal + binaryArray[i] * potenz;
            potenz = potenz * 2;
        }
        System.out.println(dezimal);
        return dezimal;
    }

}