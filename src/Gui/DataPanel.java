package Gui;

import com.sun.deploy.ui.AppInfo;
import com.sun.deploy.ui.UIFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class DataPanel  extends JPanel {
    private JButton submit;
    private JTextField ByteOffsetContainer;
    private Box layout;
    private JLabel jLabel;
    public DataPanel(){
        super();
        UpdateUI();
        layout = new Box(BoxLayout.X_AXIS);
        submit= new JButton("Submit");
        ByteOffsetContainer = new JTextField(50);
        jLabel = new JLabel("The BitOffset :-");

        add(jLabel);
        Dimension d = new Dimension(10,10);
        add(new Box.Filler(d,d,d));
        add(ByteOffsetContainer);
        add(new Box.Filler(d,d,d));
        add(submit);


    }

    public final void UpdateUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }

}
