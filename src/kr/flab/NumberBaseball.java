package kr.flab;

import java.util.Collections;
import java.util.List;

public class NumberBaseball {
    private final int NUMBER_OF_ROUND = 9;
    private final char[] CORRECT_NUMBER_SET;

    public NumberBaseball() {
        List<Character> numbers = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9');
        Collections.shuffle(numbers);

        CORRECT_NUMBER_SET = new char[3];
        for (int i = 0; i < 3; i++) {
            CORRECT_NUMBER_SET[i] = numbers.get(i);
        }
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
                    return false;
                }
            }
        }
        return true;
    }

    //	사용자 입력을 받아 정돈된 결과(아웃, 볼, 스트라이크)를 반환해주는 함수
    private String judgeNumberSet(char[] numberSet) {
        int ball = countBalls(numberSet);
        int strike = countStrikes(numberSet);
        String result;

        if(ball > 0 && strike > 0 ){
            result =  ball + " 볼" + strike + " 스트라이크 ";
        }
        else if((ball != 0 && strike == 0) || (ball == 0 && strike != 0)) {
            if(ball != 0){
                result =  ball +" 볼";
            } else {
                result = strike +" 스트라이크";
            }
        }
        else{
            result =  "아웃";
        }
        return result;
    }

    //	사용자 입력을 받아 볼이 몇 개인지 반환하는 함수
    private int countBalls(char[] numberSet) {
        int ballAmount = 0;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if ((y != x) && (CORRECT_NUMBER_SET[y] == numberSet[x])) {
                    ballAmount++;
                }
            }
        }
        return ballAmount;
    }

    //	사용자 입력을 받아 스트라이크가 몇 개인지 반환하는 함수
    private int countStrikes(char[] numberSet) {
        int strikes = 0;
        for (int i = 0; i < 3; i++) {
            if (CORRECT_NUMBER_SET[i] == numberSet[i]) {
                strikes++;
            }
        }
        return strikes;
    }
}
