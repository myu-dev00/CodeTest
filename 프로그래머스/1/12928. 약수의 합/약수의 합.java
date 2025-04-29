class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=0;
        while(a!=n){
            a++;
            if(n%a == 0)answer+=a;
            
        }
        return answer;
    }
}