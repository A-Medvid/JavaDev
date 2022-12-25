package hw8.course1.lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceLess {
    public static int rndm(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int getI() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        try {
            i = scanner.nextInt();
            if (i < 0 && i > 5) {
                throw new InputMismatchException();
            }
        } catch (Exception e) {
            System.out.println("Incorrect format, please try again");
            System.out.println();
            return getI();
        }
        return i;
    }

}
