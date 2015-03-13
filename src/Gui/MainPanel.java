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
        LayeredDataBlock db = new LayeredDataBlock(new Payload(3301,256,23423432,new IntPoint(20,200)));
        db.setVisible(true);
        db.setSize(1000, 1000);
        add(db);
        db.addNextNode(this).setSize(400,500);



    }

}
