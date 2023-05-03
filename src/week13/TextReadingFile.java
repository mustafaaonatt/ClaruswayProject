package week13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TextReadingFile {
    public static void main(String[] args) throws IOException {
        Path pth = Path.of("/Users/mustafaonat/Documents/intel project/ClaruswayProject/src/week13/File.txt");
        Stream<String> str = Files.lines(pth);
        // str.forEach(System.out::println);

        str.map(String::toUpperCase).limit(1).forEach(System.out::println);



    }
}
