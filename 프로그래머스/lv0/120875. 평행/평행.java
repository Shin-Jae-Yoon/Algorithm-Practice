class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for (int i = 0; i < dots.length - 1; i++) {
            double temp1 = calculator(dots[i] , dots[(i + 1) % 4]);
            double temp2 = calculator(dots[(i + 2) % 4], dots[(i + 3) % 4]);
            
            if (temp1 == temp2)
                answer = 1;
        }
        
        return answer;
    }
    
    public double calculator(int[] a1, int[] a2) {
        double dy = a1[1] - a2[1];
        double dx = a1[0] - a2[0];
        
        return dy / dx;
    }
}