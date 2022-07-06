package com.sofka.utilities;


import java.lang.reflect.Type;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutputUtilities {
    private static final Scanner scanner = new Scanner(System.in);

    public static int menuMaker(String title, String[] options) {
        int counter = 1;

        while (true) {
            try {
                System.out.println("\n" + title);

                for (String option : options) {
                    System.out.printf("%d. %s\n", counter++, option);
                }

                System.out.print("\n-> ");

                Integer Selection = Integer.parseInt(scanner.next());

                if (Selection > options.length || Selection <= 0) {
                    throw new InputMismatchException();
                }

                return Selection;

            } catch (InputMismatchException | NumberFormatException e) {
                counter = 1;

                if (e instanceof InputMismatchException) {
                    System.out.println(
                            "\nSeleccion invalida, digite un numero entre 1 y " + options.length);
                } else {
                    System.out.println("\nSeleccion invalida, intente de nuevo");
                }
            }
        }
    }
}
