package com.companyName.section02.looping_and_branching.level03.hard;
//문자열을 입력받는다 / 검색할 문자 입력받는다
// 입력받은 문자열에서 검색할 문자가 몇개 포함되어 있는지를 출력하는 프로그램 작성

//단, 문자열에 영문자가 아닌 문자가 섞여있는 경우에는
// 검색할 문자를 입력받지 않고 '영문자가 아닌 문자가 포함되어있습니다"를 출력후 프로그램종료

import java.util.Scanner;

//일치하는 문자의 경우 대소문자를 구분함
public class Application03
{
    public static void main(String[] args)
    {
        String str;
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 :");
        str = sc.nextLine();
        //문자열 나누기
        for (int i = 0; i < str.length(); i++)
        {
            if((int)str.charAt(i)>='a' && (int)str.charAt(i)<='z'){
                System.out.println("소문자사이임");
            }
        }
    }
}
