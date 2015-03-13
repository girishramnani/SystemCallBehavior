package Gui;

import businessLogic.DataBlockCapacity;
import businessLogic.Payload;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class DataBlock extends JPanel {
    protected Payload payload;
    public DataBlock(Payload payload){

        super();
        this.payload=payload;
        if(this.payload.getContent()==0){
            payload.setContent(DataBlockCapacity.DIRECT);
        }
    }

    public Payload generatePayload(){
        return null;
    }


    @Override
    public void paint(Graphics g) {
        Graphics2D g2d =(Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));

        if (payload != null){
            g2d.drawRect(payload.getLocationFinal().getX(),payload.getLocationFinal().getY(),50,100);
            g2d.drawString(payload.getCapacity()+" ",payload.getLocationFinal().getX()+10,payload.getLocationFinal().getY()+120);
            payload.getContent();
            payload.getCapacity();
        }
    }
}
