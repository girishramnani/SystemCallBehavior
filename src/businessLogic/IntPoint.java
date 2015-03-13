package businessLogic;

/**
 * Created by Girish on 12-03-2015.
 */
public class IntPoint {
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public IntPoint(int x, int y) {

        X = x;
        Y = y;
    }
    public IntPoint translate(int a,int b){
        return new IntPoint(X+a,Y+b);

    }
}
