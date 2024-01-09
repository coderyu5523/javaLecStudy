package ex15;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputstream = null;
        PrintWriter outputStream = null;

        try {
            inputstream = new BufferedReader(new FileReader("D:\\input.txt"));
            outputStream = new PrintWriter(new FileWriter("D:\\output.txt "));
            String l;
            while ((l = inputstream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputstream != null) {
                inputstream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
