package SubsetSubsequenceStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IterativeSubset {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int prevLen = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            int len = list.size();
            int st = 0;
            if(set.contains(num)){
                st = prevLen;
            }
            for(int i=st;i<len;i++) {
                List<Integer> numList = new ArrayList<>(list.get(i));
                numList.add(num);
                list.add(numList);
            }
            set.add(num);
            prevLen = len;
        }
        System.out.println(list);
    }
}
