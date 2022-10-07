import java.util.Scanner;

/**
 * Wendelin Spörk - 01618620
 **/

public class Einstiegsbeispiel {

/*
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 0};
        binary2decimal(array1);
        System.out.println(binary2decimal(array1));
    }

 */

    public static int binary2decimal(int[] binaryArray) {
        int dezimal = 0;
        int potenz = 1;

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            if (binaryArray[i] == 0 | binaryArray[i] == 1) {
                dezimal = dezimal + binaryArray[i] * potenz;
                potenz = potenz * 2;
            } else {
                dezimal = -1;
                break;
            }
        }
        return dezimal;
    }

}