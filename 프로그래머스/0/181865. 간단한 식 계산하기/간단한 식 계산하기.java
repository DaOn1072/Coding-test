class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");
        int a = Integer.valueOf(s[0]);
        int b = Integer.valueOf(s[2]);
        
        switch(s[1]){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default: return -1;
                }
    }
}