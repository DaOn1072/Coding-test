class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int target = 1;
        
        while (target < len){
            target *= 2;
        }
        
        if(target == len){
            return arr;
        }
        
        int[] answer = new int[target];
        
        for(int i = 0; i < len; i++){
            answer[i] = arr[i];
        }
        
        return answer;
        
    }
}