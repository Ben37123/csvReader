package com.company;
import jdk.internal.org.jline.reader.impl.LineReaderImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        Comparer newComp = new Comparer();
        newComp.find_similarities(a,b);
    }
}
