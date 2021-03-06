package Gui;

import businessLogic.DataBlockCapacity;
import businessLogic.IntPoint;
import businessLogic.Payload;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class DataBlock extends JPanel {
    protected Payload payload;
    protected IntPoint intPoint;
    protected boolean overide=false;
    public DataBlock(Payload payload, IntPoint past){

        super();
        intPoint=past;
        this.payload=payload;
        if(this.payload.getContent()==0){
            payload.setContent(DataBlockCapacity.DIRECT);
        }
    }

    public void Overide(){
        this.overide=true;
        repaint();

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
            int  a = (int) (payload.getLocationFinal().getY()+((payload.getAddress()/(float)payload.getCapacity())*80));
            g2d.drawRect(payload.getLocationFinal().getX(),a,50,20);
            if(intPoint !=null){
                if (overide){
                    g2d.drawLine(payload.getLocationFinal().getX()-5,payload.getLocationFinal().getY() + 10, this.intPoint.getX(), this.intPoint.getY()-10 );

                }else
                {
                    g2d.drawLine(payload.getLocationFinal().getX(),payload.getLocationFinal().getY()+10,this.intPoint.getX()+50,this.intPoint.getY()+10);

                }

            }
            g2d.drawString(payload.getAddress()+"",payload.getLocationFinal().getX()+10,a+15);
        }
    }
}
