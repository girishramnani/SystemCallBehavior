package Gui;

import businessLogic.INodeModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.text.html.ObjectView;

/**
 * Created by Girish on 13-03-2015.
 */
public class INodeTable extends JTable {
    private DefaultTableCellRenderer cellRenderer;

    public static final int HEIGHT=600;
    private static int WIDTH =150;
    public INodeTable(){
        super();
        cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment( DefaultTableCellRenderer.CENTER);

        setDefaultRenderer(Object.class,cellRenderer);
        setSize(WIDTH, HEIGHT);
        setRowHeight(HEIGHT/13);



    }
}
