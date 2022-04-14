package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparer {


    public static void find_similarities(List<String> a, List<String> b) {
        System.out.print(a.get(0)+": "+a.get(4)+" "+a.get(8)+" "+a.get(12)+" "+b.get(4)+" "+b.get(8)+" "+b.get(12));
        System.out.print("\n");
        System.out.print(a.get(1)+": "+a.get(5)+" "+a.get(9)+" "+a.get(13)+" "+b.get(5)+" "+b.get(9)+" "+b.get(13));
        System.out.print("\n");
        System.out.print(a.get(2)+": "+a.get(6)+" "+a.get(10)+" "+a.get(14)+" "+b.get(6)+" "+b.get(10)+" "+b.get(14));
        System.out.print("\n");
        System.out.print(a.get(3)+": "+a.get(7)+" "+a.get(11)+" "+a.get(15)+" "+b.get(7)+" "+b.get(11)+" "+b.get(15));
    }

}

