import java.util.ArrayList;

public class RemoveArrayListElement {

    public static void main(String[] args) {

        ArrayList<String> arlist=new ArrayList<String>();

        //<E> it is return type of ArrayList

        arlist.add("First Element"); // adding element in ArrayList
        arlist.add("Second Element");
        arlist.add("Third Element");
        arlist.add("forth Element");
        arlist.add("fifth Element");

        // remove array list element by index number
        arlist.remove(3);

        // remove ArrayList element by Object value
//        arlist.remove("fifth Element");

        // get elements of ArrayList 
        for(int i=0;i<arlist.size();i++)
        {
            System.out.println("ArrayList Element "+i+" :"+arlist.get(i));
        }
    }
}
