package task7_io;

import OOP_Tasks3_4_5.Animal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadAnimal {
    public ReadAnimal(String path) throws IOException {

        ObjectInputStream objectOfAnimal = null;


        try (FileInputStream readAnimal = new FileInputStream(path); ObjectInputStream in = new ObjectInputStream(readAnimal)) {
            Animal[] readiedObject = (Animal[]) in.readObject();
            for (Animal spaceObject : readiedObject) {
                System.out.println(spaceObject);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}