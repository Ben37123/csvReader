package com.company;


import java.util.ArrayList;
import java.util.List;

public class Comparer {


    public static ArrayList create_peopleList(List<String> a, List<String> b) {

        ArrayList<ArrayList<String>> people = new ArrayList<ArrayList<String>>();
        List<String> values = new ArrayList();
        ArrayList<String> person = new ArrayList();
        System.out.print("------CSV A------" + "\n");

        int numValues = 0;
        for (int i = 0; i < 4; i++) {
            values.add(a.get(i));
            numValues++;
        }
        System.out.print(values + "\n");

        int aline = numValues;
        int alineLimit = aline + 4;
        for (int i = 0; alineLimit < a.size()+1; i = i + 4) {
            person.clear();
            for (int u = aline; u < alineLimit; u++) {
                person.add(a.get(u));
            }
            people.add(person);
            aline = aline + 4;
            alineLimit = alineLimit + 4;
            System.out.print(person +"\n");
        }
        System.out.print("\n");

        System.out.print("------CSV B------" + "\n");
        System.out.print(values + "\n");
        int bline = numValues;
        int blineLimit = bline + 4;
        for (int i = 0; blineLimit < b.size()+1; i = i + 4) {
            person.clear();
            for (int u = bline; u < blineLimit; u++) {
                person.add(b.get(u));
            }
            people.add(person);
            bline = bline + 4;
            blineLimit = blineLimit + 4;
            System.out.print(person +"\n");
        }
        return people;
    }

    public static ArrayList find_similarities(ArrayList<String> people) {
        System.out.print(people);
        return null;
    }

    {

    }



}

