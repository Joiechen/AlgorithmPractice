public class StrToInt {

    public int strToInt(String str){
        if(str == null || str.length() == 0){
            return 0;
        }

        int result = 0;
        char[] chs = str.toCharArray();
        int len = chs.length;
        for(int i=len-1,j=0;i>0;i--,j++){
            int c = (int)chs[i];
            if(c<48 || c>57){
                return 0;
            } else {
                result += (c-48)*Math.pow(10,j);
            }
        }
        int c = (int)chs[0];
        if(c<=57&&c>=48){
            result += (c-48)*Math.pow(10,len -1);
        }
        if(result <-2147483648 || result>2147483647){
            return 0;
        }else if(str.equals("2147483648")){
            if(c==45){
                result = -2147483648;
            }
        }else if(str.equals("-2147483648")){
            result = -2147483648;
        } else{
            if(c == 45){
                result = -result;
            }
        }
        return result;
    }
}
