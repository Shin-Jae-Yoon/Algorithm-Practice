class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" ");
        
        // a는 x의 계수, b는 상수항
        int a = 0, b = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+"))
                continue;
            
            if ((str[i].length() == 1 || str[i].length() == 2) && !str[i].contains("x")) {
                b += Integer.parseInt(str[i]);
            } else if (str[i].length() == 1 && str[i].equals("x")) {
                a += 1;
            } else {
                str[i] = str[i].replace("x", "");
                a += Integer.parseInt(str[i]);
            }
        }
        
        String answer = "";
        if (a == 0)
            answer += b;
        else if (b == 0) {
            if (a == 1)
                answer += "x";
            else 
                answer += a + "x";
        }
        else if (a > 0 && b > 0) {
            if (a == 1)
                answer += "x" + " + " + b;
            else
                answer += a + "x" + " + " + b;
        }
        
        return answer;
    }
}