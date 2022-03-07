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
    public boolean isValid(char[] numberSet) {
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
