package Filestreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.*;

public class Zad4 {
    public static void main(String[] args) {
        String path = "C:\\Users\\YIOsman20\\input.txt";
        String outPath = "C:\\Users\\YIOsman20\\output.txt";
        try{
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            FileReader reader = new FileReader(path);
            int characterInt = reader.read();
            while (characterInt>=0)
            {
                char character  = (char)characterInt;
                if(characterInt>='A'&&characterInt<='Z')
                {
                    consonants++;
                }
                if(characterInt>= 'a'&& characterInt<='z')
                {
                    if(character == 'a' || character == 'e'||
                            character == 'i' || character == 'o'||
                            character == 'u')
                    {
                        vowels++;
                    }
                    else
                    {
                        consonants++;
                    }
                }
                if (character == '!'||character ==','||
                character=='.'||character=='?')
                {
                    punctuation++;
                }

                characterInt = reader.read();
            }

            StringBuilder builder = new StringBuilder();
            String finalResult =  builder.append("Vowels: " + vowels).append("\n").append("Consonants: " + consonants).append("\n").append("Punctuations: " + punctuation).toString();
            Path pathOutPath = Paths.get(outPath);

            System.out.println(finalResult);
            FileWriter writer=new FileWriter(outPath);
            BufferedWriter buffWriter = new BufferedWriter(writer);
            buffWriter.write("Vowels: " + vowels);
            buffWriter.newLine();
            buffWriter.write("Consonants: "+consonants);
            buffWriter.newLine();
            buffWriter.write("Punctuations: " + punctuation);
            buffWriter.newLine();

            buffWriter.close();
            reader.close();

        } catch(IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
