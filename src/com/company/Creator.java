package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Creator {
    public static void create_new_csv(List<List<String>> finalList) throws IOException {

        //initializes the fileWriter that will write the lists of strings onto the new csv file
        FileWriter writer = new FileWriter("src/com/company/CSVfiles/createdCSV.csv");

        //for loop that goes through each line and each string in each line and adds them to the new file
        for (int i = 0; i < finalList.size(); i++) {
            List<String> test = new ArrayList<>();
            for (int e = 0; e < finalList.get(i).size(); e++) {
                test.add(finalList.get(i).get(e));
            }
            test.add("\n");
            String collect = test.stream().collect(Collectors.joining(","));
            writer.write(collect);
        }
        writer.close();
    }
}
