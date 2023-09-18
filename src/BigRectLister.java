import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister{

    public static void main(String[] args){
        Rectangle one = new Rectangle(10,10);
        Rectangle two = new Rectangle(1,2);
        Rectangle three = new Rectangle(1,25);
        Rectangle four = new Rectangle(2,3);
        Rectangle five = new Rectangle(1,1);
        Rectangle six = new Rectangle(1,3);
        Rectangle seven = new Rectangle(100,10);
        Rectangle eight = new Rectangle(2,2);
        Rectangle nine = new Rectangle(3,30);
        Rectangle ten = new Rectangle(3,1);

        ArrayList<Rectangle>  recArray = new ArrayList<>();
        recArray.add(one);
        recArray.add(two);
        recArray.add(three);
        recArray.add(four);
        recArray.add(five);
        recArray.add(six);
        recArray.add(seven);
        recArray.add(eight);
        recArray.add(nine);
        recArray.add(ten);

        BigRectangleFilter x = new BigRectangleFilter();
        x.collectAll(recArray);
        System.out.println(recArray);











    }



}
