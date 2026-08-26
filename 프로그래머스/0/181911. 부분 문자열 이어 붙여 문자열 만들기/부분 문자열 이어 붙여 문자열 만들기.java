import java.util.ArrayList;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        ArrayList<String> answer = new ArrayList<>();
        int i = 0;
        
        for(int[] part : parts){
            answer.add(my_strings[i].substring(part[0], part[1]+1));
            i++;
        }
        return String.join("", answer);
    }
}