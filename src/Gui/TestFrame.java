package Gui;

import businessLogic.DataBlockCapacity;
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
                    mainPanel.addUniPanel(Payload.generateUniPayload(x[1],1<<18,435));
                    repaint();
                    break;
                case 3:
                    mainPanel.iNodeModel.addData(11,x[1]+"");
                    mainPanel.AddDiPanel(Payload.generateDipayload(x[1], DataBlockCapacity.DOUBLE_INDIRECT,342));
                    repaint();
                    break;
                case 4:
                    mainPanel.iNodeModel.addData(12,x[1]+"");
                    mainPanel.AddTriPanel(Payload.generateTriPayload(x[1], DataBlockCapacity.TRIPLE_INDIRECT,342));
                    repaint();
                    break;

            }
        });

        setExtendedState(JFrame.MAXIMIZED_BOTH);


    }



}
