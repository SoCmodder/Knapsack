import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Development
 * Date: 10/28/12
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    List<Integer> weights;
    List<Integer> prizes;

    public Item(){
        weights = new ArrayList<Integer>();
        prizes = new ArrayList<Integer>();
    }
}
