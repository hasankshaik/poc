package uk.co.dev.paperround;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Admin on 01/03/2017.
 */
public class FileService {



    public List<Integer> getFile(String fileName) {
        List<Integer> houseNumbers = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                houseNumbers.addAll(Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(Collectors.toList()));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseNumbers;
    }
}
