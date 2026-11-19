package org.example.e06oop.inheritance;

public class Whale extends Animal {
    // 필드 (Field)
    // public String name = "고래"; // 인스턴스 변수
    //public static int age = 20; // 클래스 변수

    // 생성자 메소드
    // Whale() {}

    // 메소드 (Method)
    // public void swimming() {
    //     System.out.println("고래가 헤엄칩니다.");
    // }

    // 수업용

    public Whale(String name, String residence) {
        super(name, residence);
    }

    public String swimming() {
        return String.format("%s이/가 헤엄칩니다..", super.name); // this.name 으로 접근해도 사용 가능
    }

}
