import java.util.*;

public class Solution {
    public int solution(int n) {
        int a = n;
        int answer = 0;
        while (a!=0){
           answer += (a%10);
            a /=10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}