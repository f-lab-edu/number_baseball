package kr.flab;

public class NumberBaseball {
    private final int NUMBER_OF_ROUND = 9;
    private final char[] CORRECT_NUMBER_SET;

    public NumberBaseball() {
        CORRECT_NUMBER_SET = new char[] {};
    }

    //	게임을 시작하고 정해진 라운드만큼 진행하는 함수
    public void start() {

    }

    //	사용자 입력을 받아 유효한 입력인지 확인하는 함수
    private boolean isValid(String input) {
        input = input.trim();
        return isThree(input) && isBetweenOneAndNine(input) && isNotDuplicated(input);
    }

    private boolean isThree(String input) {
        return input.length() == 3;
    }

    private boolean isBetweenOneAndNine(String input) {
        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) < '1' || input.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private boolean isNotDuplicated(String input) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    //	사용자 입력을 받아 정돈된 결과(아웃, 볼, 스트라이크)를 반환해주는 함수
    public String judgeNumberSet(char[] numberSet) {
        return null;
    }

    //	사용자 입력을 받아 볼이 몇 개인지 반환하는 함수
    public int countBalls(char[] numberSet) {
        return 0;
    }

    //	사용자 입력을 받아 스트라이크가 몇 개인지 반환하는 함수
    public int countStrikes(char[] numberSet) {
        return 0;
    }
}
