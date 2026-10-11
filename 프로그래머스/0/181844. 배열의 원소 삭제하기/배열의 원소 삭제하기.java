import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        
        for(int num : delete_list){
            deleteSet.add(num);
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            if(!deleteSet.contains(num)){
                answer.add(num);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}