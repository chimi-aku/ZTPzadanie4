package com.company;

public class CopyData implements Data {
    private Data original;
    private Data copy;

    public CopyData(Data original) {
        this.original = original;
        this.copy = new RealData(original.size());
    }


    @Override
    public int get(int idx) {
        if(original != null)
            return original.get(idx);
        else
           return copy.get(idx);
    }

    @Override
    public void set(int idx, int value) {
        if( original != null) {
            for (int i = 0; i < original.size(); i++)
                copy.set(i, original.get(i));

            original = null;
        }

        copy.set(idx, value);
    }

    @Override
    public int size() {
        return copy.size();
    }
}

