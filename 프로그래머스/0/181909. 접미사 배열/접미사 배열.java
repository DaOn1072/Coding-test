import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i < my_string.length(); i++){
            answer.add(my_string.substring(i));
        }
        
        answer.sort(null);
                       
        return answer.toArray(new String[0]);
    }
}