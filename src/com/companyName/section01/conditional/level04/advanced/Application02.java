package com.companyName.section01.conditional.level04.advanced;
//영업사원의 월급을 계산하는 프로그램을 작성
//월 급여액과 월 매출액을 입력 받아 급여를 산정
//영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받는다

//단 보너스율은 입력 받은 월 매출액에 비례하며
//계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.

import java.text.DecimalFormat;
import java.util.Scanner;

//총급여 = 월급여 + (매출액 * 보너스율)
public class Application02
{
    public static void main(String[] args)
    {
        //변수
        int mPay =0;
        int sales = 0;
        double sum = 0;
        double bonus =0;

        DecimalFormat format = new DecimalFormat("##%");

        Scanner sc = new Scanner(System.in);

        //입력
        System.out.print("월 급여 입력 :");
        mPay = sc.nextInt();;
        System.out.print("매출액 입력 :");
        sales = sc.nextInt();

        //보너스율 계산
        if(sales >= 50000000){
            bonus = 0.05;
        } else if (sales >= 30000000)
        {
            bonus = 0.03;
        } else if (sales >= 10000000)
        {
            bonus = 0.01;
        }

        //급여계산
        sum = mPay + (sales * bonus);

        //출력
        System.out.println("====================");
        System.out.println("매출액 : "+sales);
        System.out.println("보너스율 : "+format.format(bonus));
        System.out.println("월 급여 : " + mPay);
        System.out.println("보너스 금액 : " + (int)(sales * bonus));
        System.out.println("====================");
        System.out.println("총 급여 : " + (int)sum);

    }
}
