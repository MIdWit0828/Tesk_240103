package com.companyName.section02.looping_and_branching.level02.normal;

import javax.swing.text.Style;
import java.util.Scanner;

//정수를 입력받아 1부터 입력받은 정수까지 홀수이면 수/ 짝수이면 박이 정수만큼 누적되어 출력
public class Application03
{
    public static void main(String[] args)
    {
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 :");
        num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            switch (i%2){
                case 0:
                    System.out.print("박");
                    break;
                case 1:
                    System.out.print("수");
                    break;
            }
        }
    }
}
