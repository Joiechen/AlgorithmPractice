

public class BinarySearch {

    //Java的二分查找---- 只对有序的数组进行查找是最有效的
    public Integer binarySearch(int[] init,int findint){
        if(init.length == 0 || init.equals(null)){
            return -1;
        }

        int begin= 0;
        int end = init.length-1;

        while(begin<=end){
            int mid = begin + end;
            if(init[mid] == findint){
                return mid;
            }
            if(init[mid]< findint){
                begin = mid + 1;
            }
            if(init[mid] > findint){
                end = mid -1;
            }
        }
        return -1;
    }

}
