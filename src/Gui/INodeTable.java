package Gui;

import businessLogic.INodeModel;

import javax.swing.*;
import javax.swing.table.JTableHeader;

/**
 * Created by Girish on 13-03-2015.
 */
public class INodeTable extends JTable {
    private static int HEIGHT=500;
    private static int WIDTH =150;
    public INodeTable(){
        super();
        setSize(WIDTH,HEIGHT);
        setRowHeight(HEIGHT/10);
        setModel(new INodeModel());

    }
}
