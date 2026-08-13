class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String word : babbling){
            
            if (isValidWord(word)){
                answer++;
            }
        }
        return answer;
    }
    
    private boolean isValidWord(String word){
    String[] validSounds = { "aya", "ye", "woo", "ma"};
    
    for(String sound : validSounds){
        word = word.replaceFirst(sound, "-");
    }
    
    return word.replaceAll("-", "").isEmpty();
}
}


