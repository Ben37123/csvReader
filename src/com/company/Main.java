package com.company;
import jdk.internal.org.jline.reader.impl.LineReaderImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>(Arrays.asList(
                "Name","Gender","Age","Hair color",
                "John","male" ,"65","gray",
                "cindy","female","42","brown",
                "Oprah","male" ,"89","blonde"));
        List<String> b = new ArrayList<String>(Arrays.asList(
                "Name","Gender","Age","Hair Color",
                "Precilla","female","35","red",
                "Bruce","male","32","black",
                "Clark","male","69","black"));
        Comparer newComp = new Comparer();
        newComp.find_similarities(a,b);
    }
}
