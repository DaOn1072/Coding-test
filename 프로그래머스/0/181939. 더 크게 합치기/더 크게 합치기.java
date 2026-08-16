class Solution {
    public int solution(int a, int b) {
        String str1 = "" + a + b;
        String str2 = "" + b + a;
        
        int hap1 = Integer.parseInt(str1);
        int hap2 = Integer.parseInt(str2);
        
        return Math.max(hap1, hap2);
    }
}