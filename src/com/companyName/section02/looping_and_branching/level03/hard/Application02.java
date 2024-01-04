package com.companyName.section02.looping_and_branching.level03.hard;
//1부터 100사이의 난수를 발생시킨다
// 정수를 입력받아 난수보다 큰 경우 => 입력하신 정수보다 작습니다
// 난수보다 작은 경우 => 입력하신 정수보다 큽니다


import java.util.Random;
import java.util.Scanner;

public class Application02
{
    public static void main(String[] args)
    {
        int count=0;
        int num =0;
        int random = (int)(Math.random() *100) +1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("정수를 입력하세요 :");
            num = sc.nextInt();
            count++;
            if(num==random){
                System.out.println("정답입니다! "+count+"회 만에 정답을 맞추셨습니다.");
                break;
            } else if (num>random)
            {
                System.out.println("입력하신 정수보다 작습니다.");
            }
            else{
                System.out.println("입력하신 정수보다 큽니다.");
            }
        }
    }
}
