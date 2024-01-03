package com.companyName.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application01
{
    //두 개의 정수를 입력받아 변수에 저장한다
    //연산기호를 입력받아 해당 연산의 수행결과를 출력하라
    //단 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다" 출력후 프로그램종료
    //
    public static void main(String[] args)
    {
        //변수 선언
        int first = 0;
        int second = 0;
        int result = 0;
        char ch;
        Scanner sc = new Scanner(System.in);

        //동작
        System.out.print("첫 번째 정수 :");
        first = sc.nextInt();
        System.out.print("두 번째 정수 :");
        second = sc.nextInt();
        System.out.println("연산 기호를 입력하세요\n( + - * / % )");
        ch = sc.next().charAt(0);

        //문자 변환 및 계산
        switch (ch)
        {
            case '+':
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);  //출력
                break;
            case '-':
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case '*':
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case '/':
                result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;
            case '%':
                result = first % second;
                System.out.println(first + " % " + second + " = " + result);
                break;
            default:    // 연산기호가 아닌 입력값을 받았을 때 프로그램 종료
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다");
                System.exit(0);
        }

    }
}
