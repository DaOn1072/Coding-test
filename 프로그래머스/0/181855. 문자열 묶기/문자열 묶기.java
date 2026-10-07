import java.util.ArrayList;

class Solution {
    public int solution(String[] strArr) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for(int i = 0; i < strArr.length; i++){
            list.add(0);
        }
        
        for(String s : strArr){
            int len = s.length();
            list.set(len - 1, list.get(len - 1) + 1);
        }
        
        for(int j = 0; j < list.size(); j++){
            if(answer < list.get(j)){
                answer = list.get(j);
            }
        }
        
        return answer;
    }
}