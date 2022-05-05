package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import java.util.List;


public class Reader {

    private static final String COMMA_DELIMITER = ",";

    public static List<List<String>> read_file(String file) throws IOException {
        List<List<String>> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                people.add(Arrays.asList(values));
            }
        }
        return people;
    }

    public static int get_numValues(List<List<String>> peopleA) {
        int numValues = 0;
        numValues = peopleA.get(0).size();
        return numValues;
    }
}