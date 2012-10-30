import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mitch Miller
 * Date: 10/28/12
 * Time: 8:56 PM
 */
public class MergeSort {
    Item item;
    List<Integer> temp = new ArrayList<Integer>();
    List<Integer> tempWeight = new ArrayList<Integer>();
    private int size;

    /**
     * Function: sort (mergesort)
     * Precondition: Array is unsorted and initialized. The array has not been touched by the sorting algorithm
     * Postcondition: Array item 1 <= array item 2 .... etc etc
     *      The outputed Array is a permutation of the input array.
     * @param items
     */
    public void sort(Item items){
        if(item.prizes.size() == 0){
            return;
        }
        this.item = items;
        size = item.prizes.size();
        mergesort(0, size-1);
    }

    /**
     * Function: mergesort
     * Description: uses a combination of recursive calls and a merge function to
     *      sort a given array.
     * @param low
     * @param high
     */
    private void mergesort(int low, int high){
        if(low < high){
            int middle = (low + high) / 2;

            mergesort(low, middle);

            mergesort(middle + 1, high);

            merge(low, middle, high);
        }
    }

    /**
     * Function: merge
     * Description: Takes in 3 values as input and then uses those values to decide which
     *      sub arrays will be merged into which part of the overall array. The final result
     *      of which is the sorted array returned by the sort function.
     * @param low
     * @param mid
     * @param high
     */
    private void merge(int low, int mid, int high){
        for(int i=low; i<=high; i++){
            temp.add(item.prizes.get(i));
            tempWeight.add(item.weights.get(i));
        }

        int i=low;
        int j=mid+1;
        int k=low;

        while(i <= mid && j <= high){
            if(temp.get(i)/tempWeight.get(i) <= temp.get(j)/tempWeight.get(j)){
                item.prizes.set(k, temp.get(i));
                item.weights.set(k, tempWeight.get(i));
                i++;
            }
            else{
                item.prizes.set(k, temp.get(j));
                item.weights.set(k, tempWeight.get(j));
                j++;
            }
            k++;
        }
        while(i <= mid){
            item.prizes.set(k, temp.get(i));
            item.weights.set(k, tempWeight.get(i));
            k++;
            i++;
        }
    }
}
