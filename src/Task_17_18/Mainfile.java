package Task_17_18;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mainfile {
    public static void main(String[] args) {
        // first();
        //  second();
        third();
        forth();
    }

    public static void first() {
        File file = new File("D:\\Brainscloud\\Java школа!\\Java Projects\\Vadarod_Java_Practice\\src\\FileTextNew.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
        } catch (IOException e) {
            System.out.println("Error");
            //throw new RuntimeException(e);
        }

    }

    public static void second() {
//        try(FileReader fileReader = new FileReader("File.txt")){
//            fileReader.
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\Brainscloud\\Java школа!\\Java Projects\\Vadarod_Java_Practice\\src\\FileTextNew.txt");
            // fileReader.read();
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void third() {
        Ferma ferma1 = new Ferma("Ferm1", 10);
        Ferma ferma2 = new Ferma("Ferm2", 15);
        ArrayList ferms = new ArrayList<>();
        ferms.add(ferma1);
        ferms.add(ferma2);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileSerialized"))) {
//            FileOutputStream fos = new FileOutputStream("FileSerialized");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(ferms);
//            objectOutputStream.writeObject(ferma1);
//            objectOutputStream.writeObject(ferma2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void forth() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FileSerialized"))) {
//            FileInputStream fis = new FileInputStream("FileSerialized");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            //System.out.println(objectInputStream.readObject());
            List<Ferma> returnListFerma = (List<Ferma>) objectInputStream.readObject();
            System.out.println(returnListFerma.get(0));
            // System.out.println(returnListFerma.get(1));

//            System.out.println(objectInputStream.readObject());
//            System.out.println(objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    //5. Создать объект Ферма с полями. Выполнить сериализацию  2 ферм и десериализацию в файл. (интерфейс Externelizibel)
}
