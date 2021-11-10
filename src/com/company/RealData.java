package com.company;

public class RealData implements Data {
    public int[] tab;
    public RealData(int size) {
        this.tab=new int[size];
    }


    @Override
    public int get(int idx) {
        return 0;
    }

    @Override
    public void set(int idx, int value) {

    }

    @Override
    public int size() {
        return 0;
    }
}
