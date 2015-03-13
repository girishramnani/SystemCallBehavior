package businessLogic;

/**
 * Created by Girish on 13-03-2015.
 */
public class DataBlockCapacity {

    public static long DIRECT=1<<10;
    public static long SINGLE_INDIRECT =DIRECT<<8;
    public static long DOUBLE_INDIRECT = SINGLE_INDIRECT<<8;
    public static long TRIPLE_INDIRECT = DOUBLE_INDIRECT<<8;
}
