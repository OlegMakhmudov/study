package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream is = new FileInputStream("C:\\Users\\Олег\\Desktop\\The_old_man.txt");
            for (;;) {
                int code = is.read();
                if (code < 0) {
                    break;
                }
                char ch = (char) code;
                builder.append(ch);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.print(builder.toString());

    }
}
