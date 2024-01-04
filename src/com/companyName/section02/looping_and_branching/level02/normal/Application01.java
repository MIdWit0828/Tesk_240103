package com.companyName.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

//문자열을 입력 받앗서문자열의 각 인덱스별로 한 글자씩 출력
public class Application01
{
    public static void main(String[] args)
    {
        System.out.print("문자열 입력 :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(i + " : " + str.charAt(i));
        }
    }
}
