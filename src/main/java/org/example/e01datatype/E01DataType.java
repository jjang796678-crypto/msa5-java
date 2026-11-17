package org.example.e01datatype;

public class E01DataType {
    public void excute() {
        boolean bool = true;
        bool = false;
        //bool = 1; // 선언할때의 데이터 타입과 다른 경우, 타입에러가 발생한다.
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s", bool);


        // 변수 선언
        int age;
        age = 1;
        char ch = 'a';
        String st = "abc";

        // 상수
        final String USER_NAME = "길동이";
        //USER_NAME = "sad";

        // Underscore 표기법
        int num = 1_020_304_010;

        // 두 변수의 값을 스와핑 해보자
        int swap1 = 1;
        int swap2 = 2;

        int dummy;
        dummy = swap1;
        swap1 = swap2;
        swap2 = dummy;

        // 데이터 타입
        boolean bool2 = true;

        byte bt = -127;
        short sh = 32767;
        int integer = 2_147_483_647;
        long longer = 2_147_483_647L; // Long 타입은 반드시 가장 뒤에 'L'을 붙여줄 것

        double db = 3.141592;
        float ft = 3.141592F; // float 타입은 반드시 가장 뒤에 'F'를 붙여줄 것

        char ch1 = 'g';
    }
}
