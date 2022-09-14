import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 9, 5, 8, 10};
        int arrayLength = 6;
        int max = 0;

        for (int i=0; i < arrayLength; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        int min = max;

        for (int i=0; i < arrayLength; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        System.out.println("The maximum number of this array is: " + max);
        System.out.println("The minimum number of this array is: " + min);


    }
}
