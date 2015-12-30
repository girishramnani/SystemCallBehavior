package businessLogic;

import Gui.INodeTable;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.LongSummaryStatistics;


public class INodeModel extends AbstractTableModel {
    ArrayList<String> datablock ;

    private void setToDefault(){

        datablock = new ArrayList<String>();
        for(int i=0;i<13;i++)
        datablock.add(0L+" ");
    }
    public INodeModel(){
        super();
        setToDefault();


    }
    public void reset(){
        setToDefault();
    }
    public void addData(int row,String data){
        datablock.set(row,data);
        fireTableRowsUpdated(row,row);
    }

    public INodeModel(ArrayList<String> arrayList) {
        datablock = arrayList;
    }

    @Override
    public int getRowCount() {
        return datablock.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datablock.get(rowIndex);
    }
}
