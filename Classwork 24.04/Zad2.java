package Filestreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zad2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\YIOsman20\\input.txt";
        try{
            FileReader reader = new FileReader(path);
            int character = reader.read();
            int sum = 0;
            while (character>=0)
            {
                sum+=character;
                character=reader.read();
            }
            System.out.println(sum);
            reader.close();

        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw  new RuntimeException(e);
        }

    }
}
