package task7_io;

import OOP_Tasks3_4_5.Animal;
import OOP_Tasks3_4_5.Cat;
import OOP_Tasks3_4_5.Parrot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AnimalToFile {
    private Animal Cat;
    private Animal Parrot;

    public AnimalToFile(){
       Cat = new Cat();
       Cat.setName("Chitka");
       Cat.makeSound();

       Parrot = new Parrot();
       Parrot.setName("Kesha");
       Parrot.makeSound();

       try (ObjectOutputStream out = new ObjectOutputStream(
                   new FileOutputStream("D:\\IdeaProjects\\Java for TA_Sep_2022\\src\\animals.txt"))) {
           out.writeObject(new Animal[] {Cat, Parrot});
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }


    }
}
