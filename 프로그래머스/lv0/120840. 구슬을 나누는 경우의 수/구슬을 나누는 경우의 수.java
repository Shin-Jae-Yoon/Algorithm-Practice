class Solution {
    public int solution(int balls, int share) {
        return rec_func(balls, share);
    }

    static int rec_func(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return rec_func((balls - 1), (share - 1)) + rec_func(balls - 1, share);
    }
}