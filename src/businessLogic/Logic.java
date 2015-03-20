package businessLogic;

import java.util.ArrayList;

/**
 * Created by Girish on 20-03-2015.
 */
public class Logic {
    public static long[] Calculate(long test) {
        int count = 0;
        for (long datacap : DataBlockCapacity.getlist()) {
            if (test <= datacap) {
                break;

            }
            count += 1;
        }
        long index=0;
        long value=test;
        ArrayList<Long> ans = new ArrayList<Long>();
        int i = count - 1;
            if (i >=0 && test >= DataBlockCapacity.getlist().get(i)) {
                System.out.println(test / DataBlockCapacity.getlist().get(i));
                index=test/DataBlockCapacity.getlist().get(i);
                System.out.println(test % DataBlockCapacity.getlist().get(i));
                value=test % DataBlockCapacity.getlist().get(i);
                System.out.println(count);
                test = test % DataBlockCapacity.getlist().get(i);
            }


    return new long[]{index,value,count};
    }
}
