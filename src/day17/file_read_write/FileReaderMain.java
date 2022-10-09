package day17.file_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderMain {

    public static void main(String[] args) throws IOException {

        String[] names = new String[3];
        names[0] = "Sara";

        List<String> alsoNames = new ArrayList<>();
        alsoNames.add("Sara");
        System.out.println(alsoNames);
        System.out.println();

        //Loads the data from the specified file
        FileReader fileReader = new FileReader("src/day17/file_read_write/names.txt");
        //Creates an object which has the ability to read file contents
        BufferedReader bufferedReader = new BufferedReader(fileReader); //using other object as a parameter
        // Reads the first line of the file
        String line = bufferedReader.readLine();
        //While line is not empty we execute the loop
        while(line != null)  {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        System.out.println("Programm stopped.");

    }


}
