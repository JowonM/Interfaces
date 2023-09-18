import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectangleFilter implements Filter{

    public Object collectAll(ArrayList<Rectangle> X) {
        for (int i = 0; i<X.size();i++) {
            if (!accept(X.get(i))) {
                X.remove(i);
            }
        }
        return X;
    }


    @Override
    public boolean accept(Object x) {
        Rectangle xRec = (Rectangle)x;

        if(((xRec.getHeight()*2) + (xRec.getWidth()*2))>10){
            return true;
        }
        else {
            return false;
        }
    }
}
