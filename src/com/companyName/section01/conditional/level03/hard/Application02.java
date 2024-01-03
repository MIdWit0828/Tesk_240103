package com.companyName.section01.conditional.level03.hard;
import com.companyName.section01.conditional.level03.hard.Fruit;

import java.util.Objects;
import java.util.Scanner;

public class Application02
{
    //과일이름(사과 바나나 복숭아 키위) 중 한 가지를 문자열로 입력한다
    //해당하는 가격에 맞게 상품명과 가격이 출력된다
    //단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료

    public static void main(String[] args)
    {
        //변수 선언
        Fruit[] fruits = new Fruit[4];
        Fruit fruit1 = new Fruit("사과",1000);
        Fruit fruit2 = new Fruit("바나나",3000);
        Fruit fruit3 = new Fruit("복숭아",2000);
        Fruit fruit4 = new Fruit("키위",5000);

        resetFruit(fruits,fruit1,fruit2,fruit3,fruit4);



        Scanner sc = new Scanner(System.in);
        String wish ="";

        //동작
        System.out.print("과일 이름을 입력하세요 :");
        wish = sc.next();

        for(int i = 0;i<fruits.length;i++){
            if(Objects.equals(fruits[i].name, wish)){
                System.out.println(fruits[i].name + "의 가격은 " + fruits[i].price +"입니다.");
                System.exit(0);
            }
        }
        //찾는 과일이 없을 시
        System.out.println("준비된 상품이 없습니다.");
    }
public static void resetFruit(Fruit[] a,Fruit b,Fruit c,Fruit d,Fruit e){
        a[0] = b;
        a[1] = c;
        a[2] = d;
        a[3] = e;
}
}
