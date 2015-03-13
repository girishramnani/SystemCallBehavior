package Gui;

import businessLogic.INodeModel;
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
                jTable.setLocation(200,50);
                jTable.setVisible(true);
                firstIndirect = new LayeredDataBlock(new Payload(1020L,453L,23432L,new IntPoint(400,300)));
                firstIndirect.setSize(1000,500);
                LayeredDataBlock x =firstIndirect.addNextNode(this);
                x.setSize(1000,500);
                x.addNextNode(this).setSize(1000,500);
                add(firstIndirect);
                add(jTable);

    }

}
