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
                AddTriPanel(Payload.generateTriPayload(50L,1000L,5634L));
                add(jTable);

    }

    public void AddTriPanel(Payload payload){
        thirdIndirect = new LayeredDataBlock(payload);
        thirdIndirect.setSize(1000, 1000);
        LayeredDataBlock x =thirdIndirect.addNextNode(this);
        x.setSize(1000,1000);
        x.addNextNode(this).setSize(1000,1000);
        add(thirdIndirect);


    }

}
