package businessLogic;

import Gui.INodeTable;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.LongSummaryStatistics;


public class INodeModel extends AbstractTableModel {
    ArrayList<Long> datablock ;

    private void setToDefault(){
        datablock = new ArrayList<Long>();
        for(int i=0;i<10;i++)
        datablock.add(0L);
    }
    public INodeModel(){
        setToDefault();

    }

    @Override
    public String getColumnName(int column) {
        return "INODE TABLE";
    }

    public INodeModel(ArrayList<Long> arrayList) {
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
