package Gui;

import businessLogic.IntPoint;
import businessLogic.Payload;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class MainPanel extends JPanel {
    DataBlock db;
    LayeredDataBlock firstIndirect;
    LayeredDataBlock secondIndirect;
    LayeredDataBlock thirdIndirect;
    JTable jTable;
    public MainPanel(){
        super();
        setLayout(null);
        jTable = new INodeTable();
        jTable.setLocation(200,0);
        jTable.setVisible(true);
        add(jTable);

    }

}
