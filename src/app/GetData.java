package src.app;

import java.util.Scanner;

public class GetData {

    public Day getDay() {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Write a day of the week: ");
            String input = scanner.nextLine().trim().toUpperCase();
            return Day.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
            return null;
        }
        }
    }
