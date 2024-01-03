package com.companyName.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application01
{
    //정수하나를 입력 받는다.
    //양수면 => 양수다 출력
    //양수가 아닌경우 => 양수가 아니다 출력
    public static void main(String[] args)
    {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //동작
        System.out.print("정수 하나 입력 :");
        num = sc.nextInt();
        if(num > 0) System.out.println("양수다.");
        else System.out.println("양수가 아니다.");
    }

}
