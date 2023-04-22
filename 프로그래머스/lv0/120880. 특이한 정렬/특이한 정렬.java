import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int size = numlist.length;
        
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[j] - n);
                if(a > b || (a == b && numlist[i] < numlist[j])){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        
        return numlist;
    }
}