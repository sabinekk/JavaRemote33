package day17.file_read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/day17/file_read_write/homeWork.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader); //using other object as a parameter
        String line = bufferedReader.readLine();



        while (line != null) {
            System.out.println(line.toUpperCase());

            line = bufferedReader.readLine();
        }
        System.out.println("Program stopped.");


        }
    }

