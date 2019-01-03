package com.springboot.example;

public class Test2 extends Test1{
    public void fun1(){

        System.out.println("test2 fun1");
    }

    public void fun2(){
        System.out.println("test2 fun2");
    }

    public void fun3(){
        System.out.println("test2 fun3");
    }

    public static void main(String[] args) {
        Test1 x = new Test1();
        x.fun1();
        x.fun2();

        Test2 y = new Test2();
        y.fun3();

    }
}
