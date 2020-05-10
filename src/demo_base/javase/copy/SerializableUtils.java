package demo_base.javase.copy;

import java.io.*;

public class SerializableUtils {
    public static Object copyObject(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object newObject = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            try {
                newObject = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newObject;

    }
}
