class Solution {
    public Integer solution(int angle) {
        if(0<angle&&angle<90) return 1;
        else if(angle==90) return 2;
        else if(angle<180) return 3;
        else if(angle == 180) return 4;
        else {
            System.out.println("0이상 180이하까지의 각도를 입력부탁드립니다.");
            return null;
        }
    }
}