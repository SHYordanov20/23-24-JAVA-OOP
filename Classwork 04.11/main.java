import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {
    public static void main(String[] args) throws IOException {
        // chete byte po byte(bytes) i izvejda vsichko s chisla ot ASCII Table-a
        String path = "C:\\Users\\DKMihalev20\\Desktop\\input.txt";

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            int nyByte = fileInputStream.read();

            while (nyByte >= 0) {
//                System.out.print(nyByte);
                // sega si iliza kakto sme napisali vuv file-a
                System.out.print(Character.toChars(nyByte));
                nyByte = fileInputStream.read();
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        // zatvarq file-a i spira rabotata na programata
        finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }

        System.out.println();

        // drug nachin za prochitane na info ot file; chete characters
        FileReader fileReader = null;

        try {
            fileReader  = new FileReader(path);
            int character = fileReader.read();

            while (character >= 0) {
//                System.out.print(nyByte);
                // sega si iliza kakto sme napisali vuv file-a
                System.out.print(Character.toChars(character));
                character = fileReader.read();
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        // zatvarq file-a i spira rabotata na programata
        finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        System.out.println();

        // samo purviq red
//        Scanner scanner = new Scanner(new FileInputStream(path));
//        System.out.println(scanner.nextLine());

        // samo purvata duma
//        Scanner scanner = new Scanner(new FileInputStream(path));
//        System.out.println(scanner.nextLine());

//        Scanner scanner = new Scanner(new FileInputStream(path));
//        System.out.println(scanner.nextLine());
//
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }

        String outputPath = "C:\\Users\\DKMihalev20\\Desktop\\empty.txt";
        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
        Path myPath = Paths.get(path);
        for (Path path1 : myPath) {

        }


        try {
            reader = new FileReader(path);
            writer = new FileWriter(outputPath);

            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            String line = bufferedReader.readLine();

            while (line != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();

            }

            writer.write(reader.read());
        }
        catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        finally {
            reader.close();
            writer.close();
        }
    }
}