package com.companyName.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application02
{
    //정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하라
    public static void main(String[] args)
    {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //동작
        System.out.print("정수 하나 입력 :");
        num = sc.nextInt();
        if(num%2== 0){
            System.out.println("짝수다.");
        }
        else System.out.println("홀수다.");
    }
}
