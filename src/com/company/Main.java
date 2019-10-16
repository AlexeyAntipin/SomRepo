package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //<type> < name > [= <значение переменной>];
        // int long short
        // float double
        // boolean = true or false стек
        //<reference type>
        //object
        //System.out.print("Vvedite radius okruzhnosti: ");
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        //double a = in.nextDouble();
        //double b = in.nextDouble();
        //double x = 10.7;
       //int a = 10;
        //System.out.println((int)(x+a));
        //System.out.println("Result of calculating: "+ (Math.PI*r*r + Math.PI*r1*r1));
        //System.out.println(a+b);
        //long x = 1000*1000;
        //System.out.println(x*x);

        //System.out.println(Math.abs((-7)%3));
        //int a = 7;
        //int b = 3;
        //System.out.println(a/b);
        //int minutes = 1;
        //minutes += minutes;

        //minutes++;
        //minutes %= minutes;
        //minutes /= minutes;
        //
        //minutes *= minutes;
        //int x = (int)(3/1.15);
        //String string = "dawdwadwa";

        //String string1 = new String(string);

        //char ch = '1';
        //System.out.println("This is char: " + ch);
        //int a = ch;
        //System.out.println("This is char UNICODE position: " + a);
        //System.out.println((char)(a + ch));
        //double a = Math.random(); // 0 to 1
        int n = in.nextInt();
        double max=-1;
        double min=2;
        for (int i=0;i<n;i++)
        {
            double a = Math.random();
            if (a>max) max=a;
            if (a<min) min = a;
        }
        System.out.println(min);
        System.out.println(max);

    }
}
