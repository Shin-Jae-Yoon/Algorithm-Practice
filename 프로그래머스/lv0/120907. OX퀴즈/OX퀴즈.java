class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            
            int op1 = Integer.parseInt(temp[0]);
            String operator = temp[1];
            int op2 = Integer.parseInt(temp[2]);
            int result = Integer.parseInt(temp[4]);
            
            if (operator.equals("+")) {
                if (op1 + op2 == result)
                    answer[i] = "O";
                else
                    answer[i] = "X";    
            } else {
                if (op1 - op2 == result)
                    answer[i] = "O";
                else
                    answer[i] = "X";  
            }
        }
        
        return answer;
    }
}