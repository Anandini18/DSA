import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<String> arr = new ArrayList<>();
    public static List< String > generateString(int N) {

        // Either starts from 1 or starts from 0
        addStrings(arr,1,N,"0");
        addStrings(arr,1,N,"1");

        return arr;
    }

    public static void addStrings(List<String> arr, int i, int N, String s){
        if(i==N){
            arr.add(s);
            return;
        }
        addStrings(arr, i+1, N, s+"0");
        // If last char is not '1'. then only we can add strings.
        if(s.charAt(i-1)!='1') addStrings(arr,i+1,N,s+"1");
    }
}
