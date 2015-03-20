package businessLogic;

import java.util.ArrayList;

/**
 * Created by Girish on 20-03-2015.
 */
public class Logic {
    public static void Calculate(long test) {
        int count = 1;
        for (long datacap : DataBlockCapacity.getlist()) {
            if (test <= datacap) {
                break;

            }
            count += 1;
        }
        ArrayList<Long> ans = new ArrayList<Long>();
        for (int i = count - 1; i >= 0; i--) {
            if (test >= DataBlockCapacity.getlist().get(i)) {
                System.out.println(test / DataBlockCapacity.getlist().get(i));
                System.out.println(test % DataBlockCapacity.getlist().get(i));
                System.out.println();
                test = test % DataBlockCapacity.getlist().get(i);
            }
        }

    }
}
