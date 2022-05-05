package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Comparer{

    public static ArrayList find_similarities(List<List<String>> a, List<List<String>> b, int numValues) {

        List<List<String>> finalList;
        List<List<String>> combinedList = a;
        for (int i = 0; i < b.size();i++) {
            if (i == 0) {
            }
            else {
                combinedList.add(b.get(i));
            }
        }

        String valueString = new String();
        for (int i = 0; i < numValues; i++) {
            valueString += i + ": " + combinedList.get(0).get(i) + "\n";
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("How would like to match the files?\n"+"Enter the corresponding number\n"+ valueString);
        String answer = scan.nextLine();
        int intAnswer = Integer.parseInt(answer);

        for (int i = 0; i < combinedList.size(); i++) {
            if (i==0) {
                System.out.print("wait");
            }
            else{
                List<String> characterList = null;
                for (int u = 0; u < combinedList.get(i).size(); u=u+3) {
                    for(int e = 0; e < combinedList.get(i).get(u).length(); e++) {
                        String value = combinedList.get(i).get(u);
                        char[] ch = value.toCharArray();
                        for(int o = 0; o < ch.length; o++) {
                            System.out.print(value.charAt(o));
                        }
                    }
                }
            }
        }

        return null;
    }



}
