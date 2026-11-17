package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for(초기값; 조건; 증감연산)
        for(int i = 0; i < 0; i++) {
            System.out.println(i);
        }

        for(int i = 1; i < 1; i++) {
            System.out.println(i);
            for(int z = 1; z < 1; z++) {
                System.out.printf("i값: %d z값: %d %n", i, z);
            }
            System.out.println();
        }

        // while 문
        int cnt = 5;
        while (cnt < 5) {
            System.out.println("test");
            cnt += 1;
        }

        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81

        for(int i = 2; i < 10; i++) {
            System.out.printf("** %d단 **%n", i);
            for (int z = 1; z < 10; z++) {
                int y = i * z;
                System.out.printf("%d X %d = %d%n", i, z, y);
            }
            System.out.println();
        }
    }
}
