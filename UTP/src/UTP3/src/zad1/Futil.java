package zad1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Futil {
    public static void processDir(String dirName, String resultFileName){
        Path path = Paths.get(resultFileName);
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
            Files.walkFileTree(Paths.get(dirName), new SimpleFileVisitor<Path>(){
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
                    if (file.toString().endsWith(".txt")){
                        try(BufferedReader reader = Files.newBufferedReader(file, Charset.forName("Cp1250"))){
                            reader.lines().forEach(line -> {
                                try {
                                    bufferedWriter.write(line);
                                    bufferedWriter.newLine();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            });
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
