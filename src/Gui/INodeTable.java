package Gui;

import businessLogic.INodeModel;

import javax.swing.*;
import javax.swing.table.JTableHeader;

/**
 * Created by Girish on 13-03-2015.
 */
public class INodeTable extends JTable {

    public INodeTable(){
        super();
        setSize(100,500);
        setVisible(true);
        setModel(new INodeModel());

    }
}
