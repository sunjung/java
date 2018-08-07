package com.sun;

import com.sun.Deal.Deal;
import com.sun.Deal.DealIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Deal> dealList = new ArrayList<Deal>();
        dealList.add(new Deal("방수케이스"));
        dealList.add(new Deal("원피스"));
        dealList.add(new Deal("요가복"));

        DealIterator di = new DealIterator(dealList);
        while (di.hasNext()){
            System.out.println(di.next().getName());
        }
    }
}
