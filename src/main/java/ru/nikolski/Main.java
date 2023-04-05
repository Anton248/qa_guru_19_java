package ru.nikolski;

public class Main {
    public static void main(String[] args) {

        int i = 10;
        double d = 0.9;
        float f = 0.999F;
        char ch = 'a';
        boolean a = true;
        boolean b = false;

        //Математические операторы
        System.out.println("Математические операторы");
        System.out.println("10+'a' = "+i+ch);
        System.out.println("10+'a' = "+(i+ch));
        System.out.println("10+0.9 = "+i+d);
        System.out.println("10+0.9 = "+(i+d));
        System.out.println("10/0.9 = "+i/d);
        System.out.println("10%0.9 = "+i%d);
        System.out.println("10%3 = "+i%3);
        System.out.println("(10/0.9)*0.9 = "+(i/d)*d);
        System.out.println("10++ = " + i++);
        System.out.println("++11 = " + ++i);

        //Операторы сравнения
        System.out.println("\nОператоры сравнения");
        System.out.println("10==0.90 = "+(i==d));
        System.out.println("10==10 = "+(i==i));
        System.out.println("10!=10 = "+(i!=i));
        System.out.println("10>0.90 = "+(i>d));

        //Логические операторы
        System.out.println("\nЛогические операторы");
        System.out.println("true&&false = "+ (a && b));
        System.out.println("true||false = "+ (a || b));
        System.out.println("!true = "+ (!a));

        //Переполнение
        System.out.println("\nПереполнение");
        i = Integer.MAX_VALUE;
        System.out.println("i = " + i);
        System.out.println("i + 1 - 1 = " + ((i+1)-1));
        System.out.println("i + 1 = " + (i+1));


    }
}