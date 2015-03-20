package Gui;

import businessLogic.Logic;
import businessLogic.Payload;

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
        dataPanel.addActionListner((ev)-> {
            long[] x = Logic.Calculate(Long.parseLong(dataPanel.ByteOffsetContainer.getText()));
            switch ((int)x[2]){
                case 0:
                case 1:
                    mainPanel.iNodeModel.addData((int) x[0],x[1]+" ");
                    break;
                case 2:
                    mainPanel.iNodeModel.addData(10,x[1]+"");
                    mainPanel.addUniPanel(Payload.generateDipayload(x[1],1<<18,435));
                    repaint();
            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);


    }



}
