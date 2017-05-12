/**
 * Created by cameron on 5/11/17.
 */
import java.util.ArrayList;
public class TwoAList {

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if (a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < bigger.size(); i++){
            if (i < smaller.size()){
                result.add(bigger.get(i) + smaller.get(i));
            } else {
                result.add(bigger.get(i));
            }

        }
        return result;

    }
}
