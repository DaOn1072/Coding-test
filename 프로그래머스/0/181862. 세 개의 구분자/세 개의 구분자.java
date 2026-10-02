import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("[abc]", " ").trim().split("\\s+");
        return (answer.length == 1 && answer[0].isEmpty()) ? new String[]{"EMPTY"} : answer;
    }
}