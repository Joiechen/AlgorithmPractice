public class StrToInt {

    public int strToInt(String str){
        if(str == null || str.length() == 0){
            throw new IllegalArgumentException("String should not be null");
        }

        int symbol = 1;
        char[] array = str.toCharArray();
        int sum = 0;

        if(array[0] == '-'){
            symbol = -1;
            array[0] = '0';
        } else if(array[0] == '+'){
            array[0] = '0';
        }

        for(int i = 0; i<array.length;i++){
            if(array[i] < '0'||array[i]>'9'){
                return 0;
            }

            sum = sum *10 +array[i] - '0';
        }
        return sum*symbol;
    }
}
