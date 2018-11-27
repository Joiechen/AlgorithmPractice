import java.util.ArrayList;

public class SubArray01 {

    public ArrayList sumOfSubArray(int[] ascArray, int number) {
        ArrayList subArrays = new ArrayList();
        ArrayList temp = new ArrayList();
        int sum, k = 0;
        for (int i = 0; i < ascArray.length - 1; i = k) {
            sum = ascArray[i];
            temp.add(ascArray[i]);
            if (sum >= number) {
                break;
            }
            for (int j = i + 1; j < ascArray.length; j++) {
                temp.add(ascArray[j]);
                sum = sum + ascArray[j];
                if (sum == number) {
                    subArrays.add(temp.toString());
                    k = j;
                    temp.clear();
                    break;
                } else if (sum > number) {
                    temp.clear();
                    k = j;
                    break;
                }
            }
        }
        return subArrays;
    }
}
