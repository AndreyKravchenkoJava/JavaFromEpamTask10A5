package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Numbers");
            Scanner scanner = new Scanner(fileReader);
            String line = scanner.nextLine();
            int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(numbers));
            System.out.println("--------------------------------");
            OptionalInt max = Arrays.stream(numbers).max();
            System.out.println("Largest number of consecutive digits: " + max.getAsInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
