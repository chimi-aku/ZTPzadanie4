package com.company;

public class CopyData implements Data {
    private Data orginał;
    private Data kopia;

    public CopyData(Data orginał) {
        this.orginał = orginał;
        this.kopia = new RealData(orginał.size());
    }

    @Override
    public int get(int idx) {
        return orginał != null ? orginał.get(idx) : kopia.get(idx);
    }

    @Override
    public void set(int idx, int value) {
        if (orginał != null){
            for (int i = 0; i < orginał.size(); i++) {
                kopia.set(i, orginał.get(i));
            }
            orginał=null;
        }
        kopia.set(idx, value);
    }

    @Override
    public int size() {
        return kopia.size();
    }
}
