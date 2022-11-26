package kakao_mobility1;

import java.util.Scanner;

class Solution {
    public int solution(int[][] flowers) {
        int[] days = new int[365];
        int answer = 0;

        for(int i = 0; i < flowers.length;i++){
            for(int j = flowers[i][0]; j < flowers[i][1];j++){
                if(days[j] == 0){
                    days[j] = 1;
                }
            }
        }
        for(int i=0; i<365;i++){
            if(days[i] > 0){
                answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution t =  new Solution();

        int[][] test = {{2,5},{3,7},{10,11}};

        System.out.println(t.solution(test));
    }
}
