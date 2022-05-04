package com.company;
import jdk.internal.org.jline.reader.impl.LineReaderImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        int numValues = 0;
        String csvFileA = "src/com/company/csvA.csv";
        String csvFileB = "src/com/company/csvB.csv";

        Reader newReader = new Reader();
        List<List<String>> a = newReader.read_file(csvFileA);
        List<List<String>> b = newReader.read_file(csvFileB);
        numValues = (newReader.get_numValues(a));


        Comparer newComp = new Comparer();
        newComp.find_similarities(a,b,numValues);
    }
}