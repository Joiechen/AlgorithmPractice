import java.util.ArrayList;
import java.util.List;

public class SubArray {

    /***
     * 给定和，从给定数组中找出等于这个和的子数组
     * @param num
     * @param sum
     */
    public void findSubArray(int[] num,int sum){
        int left = 0;
        int right = 0;
        for(int i=0;i<num.length;i++){
            int curSum = 0;
            left = i;
            right = i;
            while(curSum < sum && right != num.length){
                curSum += num[right++];
            }
            if(curSum == sum){
                for(int j=left;j<right;j++){
                    System.out.println(num[j] + "");
                }
                System.out.println();
            }
        }
    }

    /***
     * 求给定数组的最大和子数组
     * @param params
     * @return
     */
    public List<Integer> subArraySumItem(int[] params) {
        int currentSum = 0;
        int maxSum = 0;
        int curStart = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < params.length; i++) {
            currentSum += params[i];
            if(currentSum > 0) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = curStart ;
                    end = i;
                }
            }else{
                currentSum = 0;
                curStart = i ;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = start+1; i <=end ; i++) {
            list.add(params[i]);
        }
        return list;
    }

    /***
     * 获取数组和
     * @param arr
     * @return
     */
    public int getMaxSum(int[] arr) {
        int max = -100000;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (max < sum) {
                    max = sum;
                }
            }
        }

        return max;
    }

}
