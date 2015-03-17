package tests;

import Gui.DataBlock;
import businessLogic.DataBlockCapacity;

import java.util.Scanner;

/**
 * Created by Girish on 17-03-2015.
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        System.out.println(DataBlockCapacity.getlist());
        for(long x :DataBlockCapacity.getlist()){
            if(test>x)
        }

    }
}
