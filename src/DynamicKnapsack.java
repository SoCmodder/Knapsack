import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Development
 * Date: 10/28/12
 * Time: 5:36 PM
 */
public class DynamicKnapsack {
    List<Integer> weights = new ArrayList<Integer>();
    List<Integer> prizes = new ArrayList<Integer>();
    private int max;
    Random rand = new Random();

    public int knapsack(int i, int max){
        if(i==max){
            return (max < weights.get(max)) ? 0 : prizes.get(max);
        }
        if(max < weights.get(i)){
            return knapsack(i+1, max);
        }
        return Math.max(knapsack(i + 1, max), knapsack(i + 1, max - weights.get(i)) + prizes.get(i));
    }

    public void Worst(){

    }

    public void Best(){

    }

    public void Average(){

    }

    public void setMax(int m){
        max = m;
    }
}
