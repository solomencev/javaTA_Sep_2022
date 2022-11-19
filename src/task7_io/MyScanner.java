package task7_io;

import task6exceptions.MyException;

import java.util.Scanner;
import java.io.IOException;


public class MyScanner {
    public static void main(String[] args) throws IOException {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Option 1: Save new object to file (append)");
                    AnimalToFile print = new AnimalToFile();

                    break;
                case 2:
                    System.out.println("Option2: Read all objects from file");
                    break;

                case 3:
                    System.out.println("Option 3: Quit");
                    scanner.close();
                    return;
                default:
                    throw new MyException("Invalid argument. Input '1' for print to file. Input '2' for read from file. Input '3' for Quit.");

            }
        }
    }
}
