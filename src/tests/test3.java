package tests;

import Gui.DataBlock;
import businessLogic.DataBlockCapacity;

import java.util.ArrayList;
import java.util.Scanner;


public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        int count=0;
        for(long datacap :DataBlockCapacity.getlist()){
            if(test<=datacap){
                break;

            }
            count+=1;
        }
        System.out.println();
        ArrayList<Long> ans = new ArrayList<Long>();
        for(int i=count-1;i>=0;i--){
            if(test>=DataBlockCapacity.getlist().get(i)) {
                System.out.println(test / DataBlockCapacity.getlist().get(i));
                System.out.println(test % DataBlockCapacity.getlist().get(i));
                System.out.println();
                test = test % DataBlockCapacity.getlist().get(i);
            }
        }
    }
}
