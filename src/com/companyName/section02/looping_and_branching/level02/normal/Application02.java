package com.companyName.section02.looping_and_branching.level02.normal;
//반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행없이 차례로 출력하세요
public class Application02
{
    public static void main(String[] args)
    {
        char a = 'a';
        char z ='z';
        for(int i = (int)a;i<=(int)z;i++){
            System.out.print(Character.toChars(i));
        }
    }
}
