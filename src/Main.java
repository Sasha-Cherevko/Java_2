
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");

        FileWriter writer = new FileWriter(file);

        writer.write("Привет, я строка!\nПривет, я вторая строка\nПривет, я третья строка");
        writer.close();

        int lineNum = 0;
        FileReader fileReader = new FileReader(file);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        String symbolNum = "";
        Scanner in = new Scanner(new File("text.txt"));
        while(in.hasNext())
            symbolNum += in.nextLine() + "\r\n";

        while(lineNumberReader.readLine() != null)
        {
            lineNum++;
        }

        Scanner sc = new Scanner(new FileInputStream(file));
        int wordNum=0;
        while(sc.hasNext()){
            sc.next();
            wordNum++;
        }

        System.out.println("Кол-во строк: " + lineNum);
        System.out.println("Кол-во слов: " + wordNum);
        System.out.println("Кол-во символов: " + symbolNum.length());
        lineNumberReader.close();
        fileReader.close();
    }
}
