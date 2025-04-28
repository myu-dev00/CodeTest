class Solution {
    public Integer solution(int num1, int num2) {
        Integer answer = null;
        while(answer == null){
            if(-50000<=num1&&num2<=50000 || 150000<num2&&num2<=50000)
                answer = num1 + num2;
            
            else {
                System.out.println("-50000이상 50000이하의 수로 입력해주세요.");
                return null;
            }
        }
        return answer;
    }
}