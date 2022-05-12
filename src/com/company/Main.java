package com.company;
import java.io.IOException;
import java.util.List;



public class Main {

    public static void main(String[] args) throws IOException {
        int numValues;
        String csvFileA = "src/com/company/CSVfiles/addressesA.csv";
        String csvFileB = "src/com/company/CSVfiles/addressesB.csv";

        Reader newReader = new Reader();
        List<List<String>> a = newReader.read_file(csvFileA);
        List<List<String>> b = newReader.read_file(csvFileB);
        numValues = (newReader.get_numValues(a));


        Comparer newComp = new Comparer();
        List<List<String>> finalList= newComp.find_similarities(a,b,numValues);

        Creator newCreator = new Creator();
        newCreator.create_new_csv(finalList);
    }
}