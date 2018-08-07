package com.sun.Deal;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class DealIterator implements Iterator<Deal> {

    private List<Deal> dealList;
    private int cur;

    public DealIterator(List<Deal> dealList) {
        this.dealList = dealList;
        this.cur = 0;
    }

    @Override
    public boolean hasNext() {
        return ( dealList.size() > cur ) ? true : false;
    }

    @Override
    public Deal next() {
        return dealList.get(cur++);
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Deal> action) {

    }
}
