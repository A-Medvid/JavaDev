package hw11.course1.lessons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceLess {
    private static int counterLecture = 0;

    public static void setCounterLecture(int counterLecture) {
        ServiceLess.counterLecture = counterLecture;
    }

    public static int getCounterLecture() {
        return counterLecture;
    }

    public static int getI() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        try {
            i = scanner.nextInt();
            if (i < 0) {
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
