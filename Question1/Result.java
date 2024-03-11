package Question1;

import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'getMaxValue' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMaxValue(List<Integer> arr) {
        // Write your code here
        arr.set(0, arr.get(0) - 1);
        Collections.sort(arr);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1) + 1) {
                arr.set(i, arr.get(i - 1) + 1);
            }
        }

        return Collections.max(arr);
    }

}