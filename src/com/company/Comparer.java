package com.company;
import java.util.*;

import static java.lang.Math.abs;

public class Comparer{

    public List find_similarities(List<List<String>> a, List<List<String>> b, int numValues) {


        List<Pair<Integer, Double>> pairList = new ArrayList<>();
        List<List<String>> finalList = new ArrayList<>();
        List<List<String>> combinedList = a;

        for (int i = 0; i < b.size();i++) {
            if (i == 0);
            else {
                combinedList.add(b.get(i));
            }
        }

        boolean isTrue = true;
        int counter = 0;
        String answer = "";
        while (isTrue) {
            if (counter > 0) {
                System.out.print("Please enter 1 or 2 !!!!!\n");
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like to match the files according all values or a single value? Enter 1 or 2 \n1: All Values\n2: Single Value");
            answer = scan.nextLine();
            if (Integer.valueOf(answer) == 1) {
                isTrue = false;
            }
            if (Integer.valueOf(answer) == 2) {
                isTrue = false;
            }
            counter++;
        }

        if (Integer.valueOf(answer) == 1) {
            for (int i = 0; i < combinedList.size(); i++) {
                double charValue = 0;
                if (i == 0) ;
                else {
                    for (int u = 0; u < combinedList.get(i).size(); u++) {
                        //if the value is an integer it does this for loop
                        if (isInteger(combinedList.get(i).get(u))) {
                            int intValue = Integer.parseInt(combinedList.get(i).get(u));
                            for (int p = 0; p < combinedList.size(); p++) {
                                if (p == 0) ;
                                else {
                                    for (int h = u; h < combinedList.get(p).size(); h = h + numValues) {
                                        int tempIntValue = Integer.parseInt(combinedList.get(p).get(h));
                                        charValue = charValue + (abs(intValue - tempIntValue)) / intValue;
                                    }
                                }
                            }
                        }
                        //if the value is a string it does this for loop
                        else {
                            List<String> characterList = new ArrayList<>();
                            for (int e = 0; e < combinedList.get(i).get(u).length(); e++) {
                                String value = combinedList.get(i).get(u);
                                characterList.add(String.valueOf(value.charAt(e)));
                            }
                            for (int k = 0; k < characterList.size(); k++) {
                                String currentChar = characterList.get(k);
                                for (int j = 0; j < combinedList.size(); j++) {
                                    if (j == 0) ;
                                    if (j == i) ;
                                    else {
                                        for (int m = u; m < combinedList.get(j).size(); m = m + numValues) {
                                            List<String> tempCharList = new ArrayList<>();
                                            for (int n = 0; n < combinedList.get(j).get(m).length(); n++) {
                                                String tempValue = combinedList.get(j).get(m);
                                                tempCharList.add(String.valueOf(tempValue.charAt(n)));
                                                for (int y = 0; y < tempCharList.size(); y++) {
                                                    String compareChar = tempCharList.get(y);
                                                    if (currentChar == " ") ;
                                                    else {
                                                        if (currentChar.equalsIgnoreCase(compareChar)) {
                                                            charValue++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                double fuzzyLogicValue = 0;
                for (int z = 0; z < combinedList.get(i).size(); z++) {
                    fuzzyLogicValue = fuzzyLogicValue + charValue / combinedList.get(i).get(z).length();
                }
                if (i == 0) ;
                else {
                    pairList.add(new Pair<>(i, fuzzyLogicValue));
                }
            }
        }


        if (Integer.valueOf(answer) == 2) {
            String valueString = new String();
            for (int i = 0; i < numValues; i++) {
                valueString += i + ": " + combinedList.get(0).get(i) + "\n";
            }


            boolean checkTrue = true;
            int numCounter = 0;
            String newAnswer = "";
            while (checkTrue) {
                if (numCounter > 0) {
                    System.out.print("Please enter 0 to "+(numValues-1)+"!!!!!\n");
                }
                Scanner scan = new Scanner(System.in);
                System.out.println("How would like to match the files?\n" + "Enter the corresponding number\n" + valueString);
                newAnswer = scan.nextLine();
                for (int number = 0; number < numValues; number++)
                if (Integer.valueOf(newAnswer) == number) {
                    checkTrue = false;
                }
                numCounter++;
            }


            int intAnswer = Integer.parseInt(newAnswer);
            for (int i = 0; i < combinedList.size(); i++) {
                double charValue = 0;
                if (i == 0) ;
                else {
                    for (int u = intAnswer; u < combinedList.get(i).size(); u = u + numValues) {
                        if (isInteger(combinedList.get(i).get(u))) {
                            int intValue = Integer.parseInt(combinedList.get(i).get(u));
                            for (int p = 0; p < combinedList.size(); p++) {
                                if (p == 0) ;
                                else {
                                    for (int h = u; h < combinedList.get(p).size(); h = h + numValues) {
                                        int tempIntValue = Integer.parseInt(combinedList.get(p).get(h));
                                        charValue = charValue + (abs(intValue - tempIntValue)) / intValue;
                                    }
                                }
                            }
                        }
                        else {
                            List<String> characterList = new ArrayList<>();
                            for (int e = 0; e < combinedList.get(i).get(u).length(); e++) {
                                String value = combinedList.get(i).get(u);
                                characterList.add(String.valueOf(value.charAt(e)));
                            }
                            for (int k = 0; k < characterList.size(); k++) {
                                String currentChar = characterList.get(k);
                                for (int j = 0; j < combinedList.size(); j++) {
                                    if (j == 0) ;
                                    if (j == i) ;
                                    else {
                                        for (int m = u; m < combinedList.get(j).size(); m = m + numValues) {
                                            List<String> tempCharList = new ArrayList<>();
                                            for (int n = 0; n < combinedList.get(j).get(m).length(); n++) {
                                                String tempValue = combinedList.get(j).get(m);
                                                tempCharList.add(String.valueOf(tempValue.charAt(n)));
                                                for (int y = 0; y < tempCharList.size(); y++) {
                                                    String compareChar = tempCharList.get(y);
                                                    if (currentChar == " ") ;
                                                    else {
                                                        if (currentChar.equalsIgnoreCase(compareChar)) {
                                                            charValue++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                // creates the values for which the fuzzy logic is used
                double fuzzyLogicValue = 0;
                for (int z = 0; z < combinedList.get(i).size(); z++) {
                    fuzzyLogicValue = fuzzyLogicValue + charValue / combinedList.get(i).get(z).length();
                }
                if (i == 0) ;
                else {
                    pairList.add(new Pair<>(i, fuzzyLogicValue));
                }
            }
        }

        //sorts the list of pairs based off the fuzzyLogicValue from greatest to least
        Collections.sort(pairList, Comparator.comparing(p -> -p.second));
        for (int q = 0; q < pairList.size(); q++) {
            finalList.add(combinedList.get(pairList.get(q).first));
        }
        return finalList;
    }


    //built in java Pair method not available on inteliJ so I pulled this from internet; creates a pair of two values
    class Pair<U, V>
    {
        public final U first;       // the first field of a pair
        public final V second;      // the second field of a pair

        // Constructs a new pair with specified values
        private Pair(U first, V second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        // Checks specified object is "equal to" the current object or not
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Pair<?, ?> pair = (Pair<?, ?>) o;

            // call `equals()` method of the underlying objects
            if (!first.equals(pair.first)) {
                return false;
            }
            return second.equals(pair.second);
        }

        @Override
        // Computes hash code for an object to support hash tables
        public int hashCode()
        {
            // use hash codes of the underlying objects
            return 31 * first.hashCode() + second.hashCode();
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }

        // Factory method for creating a typed Pair immutable instance
        public <U, V> Pair <U, V> of(U a, V b)
        {
            // calls private constructor
            return new Pair<>(a, b);
        }
    }

    //also got this isInteger from internet; checks if the given string is an integer or not
    public boolean isInteger (String input) { //Pass in string
        try { //Try to make the input into an integer
            Integer.parseInt( input );
            return true; //Return true if it works
        }
        catch( Exception e ) {
            return false; //If it doesn't work return false
        }
    }


}