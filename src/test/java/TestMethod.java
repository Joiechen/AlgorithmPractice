import org.junit.Test;

import java.util.List;

public class TestMethod {

    StrToInt strToInt = new StrToInt();
    SubArray subarray = new SubArray();
    ReverseList reverselist = new ReverseList();
    ListNode listnode = new ListNode(6);
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void TestSubArray() {
        int[] inputNum = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] data2 = {-2, -8, -1, -5, -9};
        int[] data3 = {2, 8, 1, 5, 9};
        String inputstr = "00356464";
        //int[] inputNum = {};
        //subarray.findSubArray(inputNum,6);
        //System.out.println(subarray.subArraySumItem(inputNum));
        System.out.println(strToInt.strToInt(inputstr));
        //System.out.println(subarray.getMaxSum(inputNum));
    }

    /***@Test
    public void TestListNode() {
        System.out.print(reverselist.reverseList(listnode));
    }

    @Test
    public void TestBinarySearch(){
        int[] test = {1};
        System.out.print(binarySearch.binarySearch(test,1));
    }***/
}
