import org.junit.Test;

import java.util.List;

public class TestMethod {

    SubArray subarray = new SubArray();
    ReverseList reverselist = new ReverseList();
    ListNode listnode = new ListNode(6);
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void TestSubArray() {
        int[] inputNum = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        subarray.findSubArray(inputNum,6);
        System.out.println(subarray.subArraySumItem(inputNum));
        System.out.println(subarray.getMaxSum(inputNum));
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
