package com.newprojectsonoops;
class calc{
    int z;
    public void add(int a,int b){
        z=a+b;
        System.out.println("this is the output of addition"+" "+z);
    }
    public void sub(int a,int b){
        z=a-b;
        System.out.println("this is the output of subtraction"+" "+z);
    }
}
class advcalc extends calc{
    public void mul(int a,int b){
        z=a*b;
        System.out.println("this is the output of mul"+" "+z);
    }
}
public class Main {
    public static void main(String[] args) {
        advcalc obj1=new advcalc();
        obj1.add(5,6);
        obj1.sub(10,2);
        obj1.mul(10,5);

    }
}