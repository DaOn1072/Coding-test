class Solution {
    public int solution(int[] num_list) {
        int hap = 0, mul = 1;
        
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i++){
                hap += num_list[i];
            }
            return hap;
        }else{
            for(int i = 0; i < num_list.length; i++){
                mul *= num_list[i];
            }
            return mul;
        }
    }
}