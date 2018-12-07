import org.junit.Test;

public class TestMethod {

    SubArray subarray = new SubArray();
    SubArray01 subArray01 = new SubArray01();
    ReverseList reverselist = new ReverseList();
    ListNode listnode = new ListNode(6);
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void TestSubArray() {
        int[] inputNum = {-1,0,1,2,3,4,6,7,8,8,10,15,16,17};
        //System.out.print("test result---" + subArray01.sumOfSubArray(inputNum,16));
        subarray.findSubArray(inputNum,16);
    }

    @Test
    public void TestListNode() {
        System.out.print(reverselist.reverseList(listnode));
    }

    @Test
    public void TestBinarySearch(){
        int[] test = {1};
        System.out.print(binarySearch.binarySearch(test,1));
    }
}
