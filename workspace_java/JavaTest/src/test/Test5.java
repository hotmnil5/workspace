package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] baseball = new int [3];
        int [] inputUser = new int [3];

        // 난수 생성
        for (int i = 0; i < baseball.length; i++){
            baseball[i] = (int)(Math.random()*9+1);
            // 중복 제거
            for (int j = 0; j < i; j++){
                if (baseball[i]==baseball[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.print("만들어진 숫자 : ");
        for (int num : baseball){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("숫자를 정했습니다. 게임을 시작합니다");
        int gameCnt = 0;
        while (true){
            System.out.println(++gameCnt + " >> ");
            for (int i = 0; i < inputUser.length; i++){
                inputUser[i] = sc.nextInt();
            }
            int strike = 0;
            int ball = 0;
            for (int i = 0; i < baseball.length; i++){
                for (int j = 0; j < inputUser.length; j++){
                    if (baseball[i] == inputUser[j] && i == j){
                        strike++;
                    }
                    else if (baseball[i] == inputUser[j] && i != j){
                        ball++;
                    }
                }
            }
            System.out.println(strike + "스트라이크" + ball + "볼");

            if (strike == 3){
                break;
            }
            else {
                strike = 0;
                ball = 0;
            }
        }
        System.out.println(gameCnt + "회만에 정답을 맞췄습니다.");
    }
//        int[] game = new int[3];
//        int inputUser[] = new int[3];
//        int strike = 0;
//        int ball = 0;
//        int gameCount = 0;
//        for (int i = 0; i<game.length; i++){
//            int rand = (int)(Math.random() * 9 + 1);
//            game[i] = rand;
//            // 중복 제거
//            for (int j = 0; j < i; j++){
//                if (game[i] == game[j]){
//                    i--;
//                    break;
//                }
//            }
//        }for (int random : game){
//            System.out.println(random + "");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        while (true){
//                for (int i = 0; i<inputUser.length; i++){
//                    System.out.print("1부터 9사이의 정수 입력 : ");
//                    inputUser[i] = sc.nextInt();
//                    gameCount++;
//                }
//                for (int i = 0; i < game.length; i++){
//                    for (int j = 0; j < inputUser.length; j++){
//                        if (game[i] == inputUser[j] && i == j){
//                            strike++;
//                        }
//                        else if (game[i] == inputUser[j] && i != j){
//                            ball++;
//                        }
//                    }
//                }
//                System.out.println(strike + "스트라이크" + ball + "볼");
//                if (strike == 3){
//                    System.out.println(gameCount + "회만에 정답을 맞췄습니다.");
//                    break;
//                }
//            }
//    }
}
