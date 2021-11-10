package com.company;

import java.util.ArrayList;
import javax.swing.*;

public class Baza extends AbstractListModel{
    private ArrayList<Data> array = new ArrayList<Data>();

    public void add(Data tab){
        array.add(tab);
        fireIntervalAdded(array, array.size(), array.size());
    }

    public void remove(int idx){
        array.remove(getElementAt(idx));
        fireIntervalRemoved(array, array.size(), array.size());
    }

    public int getSize() {
        return array.size();
    }

    public Object getElementAt(int index) {
        return array.get(index);
    }
}
