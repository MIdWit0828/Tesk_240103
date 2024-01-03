package com.companyName.section01.conditional.level04.advanced;

import java.util.Scanner;

//국 영 수 점수를 입력받는다
//평균점수를 구한다
//과락은 40점 미만이다
//평균이 60점 이상, 과락이 없을경우 => "합격입니다!"
//합격이 아닐 경우 불합격사유를 모두 출력
public class Application01
{
    static boolean isKorPassed = true;
    static boolean isEngPassed = true;
    static boolean isMatPassed = true;

    public static void main(String[] args)
    {
        //변수
        int kor = 0;
        int eng = 0;
        int mat = 0;

        double avg = 0;
        Application01 app1 = new Application01();

        Scanner sc = new Scanner(System.in);
        //동작
        System.out.print("국어 점수를 입력하세요 :");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 :");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 :");
        mat = sc.nextInt();
        app1.passedCheck(kor, eng, mat); //과락여부 체크

        avg = (double) (kor + eng + mat) / 3;
        if (avg >= 60)
        {
            if (Application01.isKorPassed && Application01.isEngPassed && Application01.isMatPassed)
            {
                System.out.println("\n합격입니다!");
            }
        } else
        {
            System.out.println("\n평균 점수 미달로 불합격입니다.");
            app1.briefing();
        }
    }

    public void passedCheck(int a, int b, int c)
    {
        if (a < 40) Application01.isKorPassed = false;
        if (b < 40) Application01.isEngPassed = false;
        if (c < 40) Application01.isMatPassed = false;
    }

    public void briefing()
    {
        if (!Application01.isKorPassed) System.out.println("국어 점수 미달로 불합격입니다");
        if (!Application01.isEngPassed) System.out.println("영어 점수 미달로 불합격입니다");
        if (!Application01.isMatPassed) System.out.println("수학 점수 미달로 불합격입니다");
    }
}
