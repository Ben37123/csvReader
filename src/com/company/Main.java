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
                "Oprah","male" ,"89","blonde",
                "Mark","male","30","black",
                "Poppy","female","32","red",
                "trixie","female","67","brown"));
        List<String> b = new ArrayList<String>(Arrays.asList(
                "Name","Gender","Age","Hair color",
                "Precilla","female","35","red",
                "Bruce","male","32","black",
                "Clark","male","69","black",
                "Bryan","male","25","brown",
                "Sarah","female","35","blonde",
                "Stephen","male","47","Black"));



        Comparer newComp = new Comparer();
        //newComp.create_peopleList(a,b);
        newComp.find_similarities(newComp.create_peopleList(a,b));
    }
}
