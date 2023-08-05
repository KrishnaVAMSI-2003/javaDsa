public class TwoOddOccuringNos {
    public int[] twoOddOccuringNumbers(int[] arr) {
        int num1=0,num2=0;
        int xorNum = arr[0];
        for(int i=1;i<arr.length;i++) {
            xorNum ^= arr[i];
        }
        int setBit = xorNum & ~(xorNum-1);
        for (int num : arr) {
            if ((setBit & num) != 0) num1 ^= num;
            else num2 ^= num;
        }
        if(num2<num1) return new int[]{num2, num1};
        return new int[]{num1, num2};
    }
}
