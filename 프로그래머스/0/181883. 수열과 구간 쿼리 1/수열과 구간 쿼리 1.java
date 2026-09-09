import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            for(int i = s; i <= e; i++){
                answer[i] += 1;
            }
        }
        return answer;
    }
}