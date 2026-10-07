class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int lenA = arr1.length;
        int lenB = arr2.length;
        
        int hapA = 0, hapB = 0;
        
        if(lenA != lenB){
            return lenA > lenB ? 1 : -1;
        }
        
        for(int i = 0; i < lenA; i++){
            hapA += arr1[i];
            hapB += arr2[i];
        }
        
        if(hapA == hapB){
            return 0;
        }else{
            return hapA > hapB ? 1 : -1;
        }
    }
}