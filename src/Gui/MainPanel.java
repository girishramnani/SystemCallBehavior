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
    DataBlock firstIndirect;
    LayeredDataBlock secondIndirect;
    LayeredDataBlock thirdIndirect;
    JTable jTable;
    INodeModel iNodeModel;
    public MainPanel(){
                super();
        iNodeModel = new INodeModel();

        setLayout(null);
                jTable = new INodeTable();
                jTable.setLocation(200,50);
                jTable.setVisible(true);
                jTable.setModel(iNodeModel);

                add(jTable);

    }
    public INodeModel getInodeModel(){
        return iNodeModel;
    }
    public void AddDiPanel(Payload payload){
        secondIndirect = new LayeredDataBlock(payload,new IntPoint(300,650));
        secondIndirect.Overide();
        secondIndirect.setSize(1000, 1000);
        LayeredDataBlock x =secondIndirect.addNextNode(this);
        x.setSize(1000,1000);
        add(secondIndirect);

    }

    public void addUniPanel(Payload payload){
        firstIndirect = new DataBlock(payload,new IntPoint(300,520));
        firstIndirect.setSize(1000,1000);
        add(firstIndirect);
    }

    public void AddTriPanel(Payload payload){
        thirdIndirect = new LayeredDataBlock(payload,new IntPoint(300,620));
        thirdIndirect.setSize(1000, 1000);
        LayeredDataBlock x =thirdIndirect.addNextNode(this);
        x.setSize(1000,1000);
        x.addNextNode(this).setSize(1000,1000);
        add(thirdIndirect);


    }

}
