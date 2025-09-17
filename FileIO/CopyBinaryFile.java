import java.io.*;
public class CopyBinaryFile {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("source.bin");
            FileOutputStream fos = new FileOutputStream("destination.bin");
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("Binary file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}