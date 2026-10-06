import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        Set<Integer> used = new LinkedHashSet<>();
        
        for(int num : arr){
            used.add(num);
            if(used.size() == k){
                break;
            }
        }
        
        int idx = 0;
        for(int num : used){
            answer[idx++] = num;
        }
        
        return answer;
    }
}