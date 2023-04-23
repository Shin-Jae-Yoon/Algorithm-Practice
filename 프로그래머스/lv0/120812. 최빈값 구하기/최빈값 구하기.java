class Solution {
    public int solution(int[] array) {
        int[] countArr = new int[1000];
        int max = Integer.MIN_VALUE;
        int idx = 0;
        
        for (int i = 0; i < array.length; i++) {
            countArr[array[i]]++;
        }
        
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 0)
                continue;
            
            if (max < countArr[i]) {
                max = countArr[i];   
                idx = i;
            }
        }
        
        int count = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 0)
                continue;
            
            if (max == countArr[i])
                count++;
        }
        
        if (count > 1)
            return -1;
        else
            return idx;
    }
}