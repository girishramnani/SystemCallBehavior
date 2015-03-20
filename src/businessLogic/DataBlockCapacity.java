package businessLogic;

import java.util.ArrayList;

/**
 * Created by Girish on 13-03-2015.
 */
public class DataBlockCapacity {
    public static long D2=1024;
    public static long DIRECT=10240;
    public static long SINGLE_INDIRECT =D2<<8;
    public static long DOUBLE_INDIRECT = SINGLE_INDIRECT<<8;
    public static long TRIPLE_INDIRECT = DOUBLE_INDIRECT<<8;
    private static ArrayList<Long> x ;
    public static ArrayList<Long> getlist(){
        if(x ==null){
            x = new ArrayList<Long>();
            long li=DIRECT;
            x.add(D2);
            x.add(10240L);
            x.add(SINGLE_INDIRECT);
            for(int i=2;i<4;i++) {
                x.add(x.get(i - 1) << 8);
            }
        }

        return  x;

    }
}
