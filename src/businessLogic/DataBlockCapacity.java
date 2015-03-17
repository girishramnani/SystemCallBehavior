package businessLogic;

import java.util.ArrayList;

/**
 * Created by Girish on 13-03-2015.
 */
public class DataBlockCapacity {

    public static long DIRECT=1<<10;
    public static long SINGLE_INDIRECT =DIRECT<<8;
    public static long DOUBLE_INDIRECT = SINGLE_INDIRECT<<8;
    public static long TRIPLE_INDIRECT = DOUBLE_INDIRECT<<8;

    public static ArrayList<Long> getlist(){
        long li=DIRECT;
        ArrayList<Long> x = new ArrayList<Long>();
        x.add(10240L);
        x.add(SINGLE_INDIRECT);
        for(int i=2;i<4;i++){
            x.add(x.get(i-1)<<8);
        }
        System.out.println(x);
        return  x;

    }
}
