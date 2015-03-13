package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class TestFrame extends JFrame {
    DataPanel dataPanel;
    MainPanel mainPanel;
    public TestFrame(String name){


        //initialization
        super(name);
        dataPanel  = new DataPanel();
        mainPanel = new MainPanel();



        setLayout(new BorderLayout());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(640, 480));

        //adding the component
        add(dataPanel,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);

        setExtendedState(JFrame.MAXIMIZED_BOTH);


    }



}
