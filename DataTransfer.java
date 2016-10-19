import java.util.Scanner;
import java.io.*;


public class DataTransfer {

  public static void main(String[] args) throws IOException {

    File temp = new File("/Users/Halcyon/Desktop/Eclipse Files/InputFile.txt");
    Scanner file = new Scanner(temp);

    while (file.hasNext()) {
      String FahNum = file.nextLine();
      System.out.println(FahNum);
    }

    file.close();
  }
}
