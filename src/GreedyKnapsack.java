import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Development
 * Date: 10/28/12
 * Time: 5:35 PM
 */
public class GreedyKnapsack {
    Item i;
    Item itemsCarried;
    MergeSort m;
    private int maxLoad=0;
    private int loadCarried=0;

    /**
     *
     * @return
     */
    public Item knapsack(Item q){
        m = new MergeSort();
        m.sort(q);
        q = m.item;
        //non-ascending order
        Collections.reverse(q.weights);
        Collections.reverse(q.prizes);


        for(int i=0; i<q.prizes.size(); i++){
            if(loadCarried + q.weights.get(i) <= maxLoad){
                itemsCarried.weights.set(i, q.weights.get(i));
                itemsCarried.prizes.set(i, q.prizes.get(i));
            }
        }

        return q;
    }

    /**
     *
     */
    public void worst(int size){

    }

    /**
     *
     */
    public void best(int size){

    }

    /**
     *
     */
    public void average(int size){

    }
}
