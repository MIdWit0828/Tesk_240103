package com.companyName.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

//1부터 입력받은 정수까지의 짝수의 합을 구하세요
public class Application03
{
    public static void main(String[] args)
    {
        int sum = 0;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 하나 입력 :");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++)
        {
            sum += ++i;
        }
        System.out.println("1부터 " + num + "까지의 짝수의 합 : " + sum);
    }
}

