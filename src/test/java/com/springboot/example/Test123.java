package com.springboot.example;

import java.text.ParseException;

public class Test123 {
    public static void main(String[] args) throws ParseException{
        /*int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);*/
//        System.out.println(new Date().getTime());
//        System.out.println(new Date().getTime() + 24*60*60*1000);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
////        System.out.println(sdf.format(new Date().getTime()));
////
////        Date date = sdf.parse("2018-07-16");
////        System.out.println(date.getTime());
//
//        Date date1 = sdf.parse("2018-07-17");
//        Date date2 = sdf.parse("2018-07-18");
//        System.out.println(date1.getTime());
//        System.out.println(date2.getTime());

        byte xx = 4;
        xx += 1;
        byte yy = 3;

        int i = 1;
        long k = 22;
        long j = i + k;
        System.out.println(i+xx);

        Byte x = new Byte((byte) 129);
        System.out.println(x);
        Byte y = new Byte((byte) 128);
        int e = 444;
        int f = 444;
        Integer c = 222;
        Integer d = 222;
        Integer a = 333;
        Integer b = 333;
        System.out.println(a.equals(b));
        System.out.println(x == 127);
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(x.equals(y));


//        StringBuilder x = new StringBuilder("");
//
//        System.out.println(x.equals(new StringBuilder("")));
//
//        BigDecimal total = BigDecimal.valueOf(0.01);
//        BigDecimal total1 = new BigDecimal("0.01");
//        System.out.println(total);
//        System.out.println(total1);
    }
}
