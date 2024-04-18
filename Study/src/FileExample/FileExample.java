package FileExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream is = new FileInputStream("C:\\Users\\Олег\\Desktop\\file.txt");
            for(;;) {

                int code = is.read();
                if(code < 0) {
                    break;
                }
                char ch = (char) code;
                builder.append(ch);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}