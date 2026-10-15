class Solution {
    public int solution(int[] date1, int[] date2) {
        if(date1[0] < date2[0]){
            return 1;
        }
        
        // 연도가 같고 월이 빠를 때
        if(date1[0] == date2[0] && date1[1] < date2[1]){
            return 1;
        }
        
        // 연도와 월이 같고 일이 빠를 때
        if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]){
            return 1;
        }
        
        return 0;
    }
}