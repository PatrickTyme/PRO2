package Opgaver.Opg1;

import Udleveret.demopersist.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 1.
        MyTime time1 = new MyTime();

        // 2.
        time1.increase();
        time1.increase();
        time1.increase();
        time1.increase();

        // 3.
        System.out.println(time1.getTime());

        String filename = "C:/Users/Patri/IdeaProjects/PRO2/L20 Arkitektur Serializable/src/Opgaver/Opg1/timeFile.ser";
//        try (FileOutputStream f_out = new FileOutputStream(filename);
//             ObjectOutputStream obj_out = new ObjectOutputStream(f_out)
//        ) {
//            obj_out.writeObject(time1);
//            System.out.println("Tid gemt: " + time1);
//        } catch (IOException ex) {
//            System.out.println("Error serializing object");
//            System.out.println(ex);
//        }

        try (FileInputStream file_in = new FileInputStream(filename);
             ObjectInputStream obj_in = new ObjectInputStream(file_in)
        ) {
            Object obj = obj_in.readObject();
            time1 = (MyTime) obj;
//            time1.saveTime();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing object");
            System.out.println(ex);
            return;
        }

        System.out.println("Tid hentet: " + time1);
    }
}
