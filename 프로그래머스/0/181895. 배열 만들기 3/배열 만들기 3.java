import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] val : intervals){
            for(int i = val[0]; i <= val[1]; i++){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}