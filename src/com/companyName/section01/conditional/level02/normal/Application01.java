package com.companyName.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application01
{
    //1~10사이의 정수 한개를 입력받는다
    //홀수인지 짝수인지 확인한다
    //홀수라면 => 홀수다 / 짝수라면 => 짝수다
    //단, 1~10사이의 정수가 아닌 경우 "반드시 1~10사이의 정수를 입력해야 합니다." 출력
    public static void main(String[] args)
    {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //동작
        System.out.print("1~10 사이의 정수 하나 입력 :");
        num = sc.nextInt();
        if (num < 1 || num > 10)
        {
            System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
        } else
        {
            if (num % 2 == 0)
            {
                System.out.println("짝수다.");
            } else System.out.println("홀수다.");
        }

    }
}
