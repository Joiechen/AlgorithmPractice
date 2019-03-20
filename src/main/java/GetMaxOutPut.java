
public class GetMaxOutPut {

    /***
     * 输入整数n，输出1到n的十进制最大整数
     * @param n
     */
    public void getMaxOut(int n){
        if(n<=0){
            throw new IllegalArgumentException("Please at lease input a num not less than 0");
        }

        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = 0;
        }
        while(addOne(arr) == 0){
            printArray(arr);
        }
    }

    /**
     * 输入数组的元素，从左到右，从第一个非0值到开始输出到最后的元素。
     *
     * @param arr 要输出的数组
     */
    public void printArray(int[] arr) {
        // 找第一个非0的元素
        int index = 0;
        while (index < arr.length && arr[index] == 0) {
            index++;
        }
        // 从第一个非0值到开始输出到最后的元素。
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // 条件成立说明数组中有非零元素，所以需要换行
        if (index < arr.length) {
            System.out.println();
        }
    }

    /**
     * 对arr表示的数组的最低位加1 arr中的每个数都不能超过9不能小于0，每个位置模拟一个数位
     *
     * @param arr 待加数组
     * @return 判断最高位是否有进位，如果有进位就返回1，否则返回0
     */
    public int addOne(int[] arr) {
        // 保存进位值，因为每次最低位加1
        int carry = 1;
        // 最低位的位置的后一位
        int index = arr.length;
        do {
            // 指向上一个处理位置
            index--;
            // 处理位置的值加上进位的值
            arr[index] += carry;
            // 求处理位置的进位
            carry = arr[index] / 10;
            // 求处理位置的值
            arr[index] %= 10;
        } while (carry != 0 && index > 0);
        // 如果index=0说明已经处理了最高位，carry>0说明最高位有进位，返回1
        if (carry > 0 && index == 0) {
            return 1;
        }
        // 无进位返回0
        return 0;
    }

}
