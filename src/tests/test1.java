package tests;

import Gui.TestFrame;

import javax.swing.*;

/**
 * Created by Girish on 12-03-2015.
 */
public class test1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new TestFrame("SystemCall behavior"));

    }
}
