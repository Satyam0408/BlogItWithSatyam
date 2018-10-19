package java_8_Streams;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class FileSearchUsingStreams {

    public static void main(String[] args) {
        {
            Path path = FileSystems.getDefault()
                .getPath("files", "text_file.txt");
            String searchTerm = "Stream";

            try (Stream<String> lines = Files.lines(path)) {
                Optional<String> line = lines.filter(l -> l.contains(searchTerm))
                    .findFirst();
                if (line.isPresent()) {
                    System.out.println(line.get());
                } else
                    System.out.println("Not found");
            } catch (Exception e) {
            }
        }
    }

}