import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("/home/angel/JavaNetwork/Resources/Motorcycles.txt");
        int data;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            while((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch(IOException e) {
            
        }
    }
}
