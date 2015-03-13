package Gui;

import businessLogic.Payload;

import javax.swing.*;

/**
 * Created by Girish on 13-03-2015.
 */
public class LayeredDataBlock extends  DataBlock {
    private LayeredDataBlock db;
    public LayeredDataBlock(Payload payload){
        super(payload);
    }
    public LayeredDataBlock addNextNode(JPanel jp){
        db = new LayeredDataBlock(new Payload(payload.getAddress()%256,payload.getCapacity(),payload.getContent(),payload.getLocationFinal().translate(100,0)));
        db.setVisible(true);
        jp.add(db);
        return db;
    }
    public LayeredDataBlock getLayerDataBlock(){
        return db;
    }

}
