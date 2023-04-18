class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };

        String[] arr = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(arr[i].equals(morse[j])){
                    sb.append((char)(j + 'a'));
                    break;
                }
            }
        }
        return sb.toString();
    }
}