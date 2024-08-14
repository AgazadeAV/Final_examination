package model.writer;

import java.io.*;

public class FileHandler implements Writer {
    private String filePath = "src/model/writer/serialized_files/data.azer";

    @Override
    public void save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
        } catch (Exception e) {
            System.out.println("File not found, but will be created.");
        }
    }

    @Override
    public Object read() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("File not found, but will be created.");
            return null;
        }
    }

    @Override
    public void setPath(String filePath) {
        this.filePath = filePath;
    }
}
