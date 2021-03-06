package businessLogic;

/**
 * Created by Girish on 12-03-2015.
 */
public class Payload {
    private long address;
    private long capacity;
    private long content;
    private IntPoint location;



    public static Payload generateTriPayload(long address, long capacity, long content){
        return new Payload(address,capacity,content, new IntPoint(500,500));

    }

    public static Payload generateUniPayload(long address, long capacity, long content){
        return new Payload(address,capacity,content,new IntPoint(500,400));
    }
    public Payload(long address, long capacity, long content, IntPoint location) {
        if(capacity <address) {
            try {
                throw new PayloadException("The capacity is less than the address");
            } catch (PayloadException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
        this.address = address;
        this.capacity = capacity;
        this.content = content;
        this.location = location;
    }

    public IntPoint getLocationFinal() {
        return location;
    }

    public void setLocation(IntPoint location) {
        this.location = location;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getContent() {
        return content;
    }

    public void setContent(long content) {
        this.content = content;
    }
    public static Payload generateDipayload(long address,long capacity,long content ){
        return new Payload(address,capacity,content, new IntPoint(500,400));
    }


}
