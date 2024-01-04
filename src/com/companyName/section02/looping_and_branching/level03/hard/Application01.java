package com.companyName.section02.looping_and_branching.level03.hard;
//2보다 큰 정수를 하나 입력
// 그 수가 소수인지 아닌지를 판별하기
// 소수인경우 소수다 / 아닌경우 소수가 아니다
//단, 2보다 큰 정수가 아닌경우 잘못 입력하셨습니다. 다시입력하세요. 출력 한 후 다시 입력 받을 수 있도록 한다

import java.util.Scanner;

//어떤수를 1부터 자기 자신까지 차례대로 나누었을 때 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수
public class Application01
{
    public static void main(String[] args)
    {
        int num =0;
        Scanner sc = new Scanner(System.in);
        boolean isDecimal = true;

        //2이상인지 확인
        while (true){
            System.out.print("2보다 큰 정수를 하나 입력하세요 :");
            num = sc.nextInt();
            if(num >1) break;
            System.out.println("잘못 입력하셨습니다. 다시입력하세요.\n\n");
        }
        for(int i =2;i<num;i++){
            if(num%i == 0) isDecimal = false;
        }
        if (isDecimal) System.out.println("소수다.");
         else System.out.println("소수가 아니다.");
    }
}
