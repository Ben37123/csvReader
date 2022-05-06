package com.company;
import java.util.*;

public class Comparer{

    public List find_similarities(List<List<String>> a, List<List<String>> b, int numValues) {
        List<Pair<Integer, Double>> pairList = new ArrayList<>();
        List<List<String>> finalList = new ArrayList<>();
        List<List<String>> combinedList = a;
        for (int i = 0; i < b.size();i++) {
            if (i == 0) {
            }
            else {
                combinedList.add(b.get(i));
            }
        }

        for (int r = 0; r < numValues; r++) {
            //String valueString = new String();
            //for (int i = 0; i < numValues; i++) {
            //    valueString += i + ": " + combinedList.get(0).get(i) + "\n";
            //}
            //Scanner scan = new Scanner(System.in);
            //System.out.println("How would like to match the files?\n"+"Enter the corresponding number\n"+ valueString);
            //String answer = scan.nextLine();
            //int intAnswer = Integer.parseInt(answer);
            int intAnswer = r;
            for (int i = 0; i < combinedList.size() - 1; i++) {
                if (i == 0) ;
                else {
                    for (int u = intAnswer; u < combinedList.get(i).size(); u = u + numValues) {
                        List<String> characterList = new ArrayList<>();
                        int charValue = 0;
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
                                    for (int m = intAnswer; m < combinedList.get(j).size(); m = m + numValues) {
                                        List<String> tempCharList = new ArrayList<>();
                                        for (int n = 0; n < combinedList.get(j).get(m).length(); n++) {
                                            String tempValue = combinedList.get(j).get(m);
                                            tempCharList.add(String.valueOf(tempValue.charAt(n)));
                                            for (int y = 0; y < tempCharList.size(); y++) {
                                                String compareChar = tempCharList.get(y);
                                                if (currentChar.equalsIgnoreCase(compareChar)) {
                                                    charValue++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        double fuzzyLogicValue = (double) charValue / combinedList.get(i).get(u).length();
                        pairList.add(new Pair<>(i, fuzzyLogicValue));
                    }
                }
            }
        }
        Collections.sort(pairList, Comparator.comparing(p -> -p.second));
        for (int q = 0; q < pairList.size(); q++) {
            finalList.add(combinedList.get(pairList.get(q).first));
        }
        for (int poop = 0; poop < finalList.size(); poop++) {
            System.out.print(finalList.get(poop) + "\n");
        }
        return finalList;
    }



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



}
