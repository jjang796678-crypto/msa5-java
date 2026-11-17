package org.example.e03if;

public class E03If {
    public static void main(String[] args) {
        // IF로 만들어주세요.
// 성적
// 범위 :
//		100   : A+
//		90이상 100미만 : A
//		80이상 90미만 : B
//		70이상 80미만 : C
//		60이상 70미만 : D
//		60미만: F

//출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"

        // 0~100의 숫자가 아닐 경우, 오동작한다.
        // 해당 현상을 아래처럼 수정하시오.
        // 0~100의 숫자가 아닐 경우, "유효한 점수가 아닙니다." 출력
        // 그외 패턴은 기존과 동일

        int point;
        String rank;
        rank = "";
        point = 101;
        if (point > 100 || point < 0) {
            System.out.println("유효한 점수가 아닙니다.");
        } else {
                if (point == 100) {
                    rank = "A+";
                } else if (point >= 90) {
                    rank = "A";
                } else if (point >= 80) {
                    rank = "B";
                } else if (point >= 70) {
                    rank = "C";
                } else if (point >= 60) {
                    rank = "D";
                } else {
                    rank = "F";
                }
                String result = String.format("당신의 점수는 %d 점 입니다. <%s>", point, rank);
                System.out.println(result);
            }

        System.out.println("======================");
        // 풀이
        int score = 100;
        String grade = "";

        if(score < 0 || score > 100) {
            System.out.println("유효한 점수가 아닙니다.");
        } else {
            if(score == 100) {
                grade = "A+";
            } else if(score >= 90) {
                grade = "A";
            } else if(score >= 80) {
                grade = "B";
            } else if(score >= 70) {
                grade = "C";
            } else if(score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("당신의 점수는 %d점 입니다. <%s>", score, grade);
        }

        System.out.println();

        if (score >= 0 && score <= 100) {
            if(score == 100) {
                grade = "A+";
            } else if(score >= 90) {
                grade = "A";
            } else if(score >= 80) {
                grade = "B";
            } else if(score >= 70) {
                grade = "C";
            } else if(score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf("당신의 점수는 %d점 입니다. <%s>", score, grade);
        } else {
            System.out.println("유효한 점수가 아닙니다.");
        }

        System.out.println();

        // Switch 문
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }
    }
}
