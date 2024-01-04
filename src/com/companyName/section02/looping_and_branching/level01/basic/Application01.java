package com.companyName.section02.looping_and_branching.level01.basic;

// 1부터 10까지 합계를 구하고 결과를 출력
public class Application01
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i < 11; i++)
        {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 :  " + sum);
    }
}
