import java.io.*;

public class PersonFileWriter {
    public static void main(String[] args) {
        // Đối tượng Person cần lưu
        Person person = new Person("John", 30);

        // Đường dẫn đến tệp văn bản để lưu đối tượng Person
        String filePath ="../java/com/example/crud2/person.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            // Ghi đối tượng Person vào tệp văn bản
            objectOutputStream.writeObject(person);

            System.out.println("Đã lưu đối tượng Person vào tệp " + filePath);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
