package com.company;

public class ProxyData implements Data{
    private int size;
    private RealData array;

    public ProxyData(int size) {
        this.size = size;
    }

    @Override
    public int get(int idx) {
        if (array==null) return 0;
        return array.get(idx);
    }

    @Override
    public void set(int idx, int value) {
        if (array == null) array = new RealData(this.size);
        array.set(idx, value);
    }

    @Override
    public int size() {
        return this.size;
    }
}
