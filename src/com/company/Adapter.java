package com.company;

import javax.swing.table.AbstractTableModel;

public class Adapter extends AbstractTableModel {
    private Data content;

    public void setContent(Data content) {
        this.content = content;
        fireTableDataChanged();
    }

    public Adapter( Data content ) {
        this.content = content;
    }


    @Override
    public int getRowCount() {
        return content.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if( columnIndex == 0)
            return rowIndex;
        else if (columnIndex == 1)
            return content.get(rowIndex);

        return  null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 1)
            return true;
        else
            return false;
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        if(columnIndex==1) content.set(rowIndex,Integer.valueOf(value.toString()));
        super.setValueAt(value, rowIndex, columnIndex);
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return super.getColumnClass(columnIndex);
    }
}
