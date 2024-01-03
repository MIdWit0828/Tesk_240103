package com.companyName.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application02
{
    //BMI를 계산하고 계산된 값에 따라
    // 20미만 = 저체중
    // 20이상 25미만 = 정상체중
    // 25이상 30미만 = 과체중
    // 30이상 = 비만

    //BMI = 체중(kg) / 신장(m)^2
    public static void main(String[] args)
    {
        //변수 선언
        int weight = 0, bmi = 0;
        double height = 0;

        Scanner sc = new Scanner(System.in);

        //동작
        System.out.print("당신의 체중(kg)을 정수로 입력하시오. :");
        weight = sc.nextInt();
        System.out.print("당신의 신장(cm)을 입력하시오. :");
        height = sc.nextDouble();

        //계산
        bmi = (int) (weight / Math.pow((height * 0.01), 2));
        //출력
        if (bmi >= 30)
        {
            System.out.println("당신은 비만입니다.");
        } else if (bmi >= 25)
        {
            System.out.println("당신은 과체중입니다.");
        } else if (bmi >= 20)
        {
            System.out.println("당신은 정상체중입니다.");
        } else System.out.println("당신은 저체중입니다.");
        System.out.println("(BMI : " + bmi + ")");

    }
}
