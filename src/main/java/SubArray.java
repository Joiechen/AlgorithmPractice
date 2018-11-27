public class SubArray {

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
                    System.out.print(num[j] + "");
                }
                System.out.println();
            }
        }
    }
}
