package task8generics_collections;

import task6exceptions.MyException;
import task7_io.AnimalToFile;
import task7_io.ReadAnimal;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyScannerV2 {


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) throws IOException {



        Scanner scanner = new Scanner(System.in);
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("first");


        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Save new object to file");
                    AnimalToFile print = new AnimalToFile();

                    break;
                case 2:
                    System.out.println("Read all objects from file");
                    ReadAnimal read = new ReadAnimal("D:\\IdeaProjects\\Java for TA_Sep_2022\\src\\animals.txt");
                    break;

                case 3:
                    System.out.println("Quit");
                    scanner.close();
                    return;

                case 4:
                    System.out.println("Add object, input Integer key");

                    while (scanner.hasNextLine()) {
                        String name = scanner.next();
                        System.out.println(myHashSet.add(name));
                        break;
                    }

                    break;


                case 5:
                    System.out.println("Remove object");
                    String name = scanner.next();
                    System.out.println(myHashSet.remove(name));
                    break;

                case 6:
                    System.out.println("Read all");
                    for (String item : myHashSet) {
                        System.out.println(item);
                    }
                    break;

                case 7:
                    System.out.println("Update object: input value that will be replaced");
                    String nameUpdate = scanner.next();
                    System.out.println(myHashSet.remove(nameUpdate));
                    System.out.println("Update object: input new value");
                    String newName = scanner.next();
                    System.out.println(myHashSet.add(newName));
                    break;

                default:
                    throw new MyException("Invalid argument. \n" +
                            "Input '1' for print to file. \n" +
                            "Input '2' for read from file. \n" +
                            "Input '3' for Quit. Input '4' for AddObject. \n" +
                            "Input '5' for Remove object. \n" +
                            "Input '6' for Read all. \n" +
                            "Input '7' for Update object.");

            }
        }
    }
}