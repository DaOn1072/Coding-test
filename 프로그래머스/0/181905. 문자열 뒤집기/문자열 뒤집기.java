class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder str = new StringBuilder(my_string);
        
        while(s < e){
            char temp = str.charAt(s);
            str.setCharAt(s, str.charAt(e));
            str.setCharAt(e, temp);
            
            s++;
            e--;
        }
        return str.toString();
    }
}