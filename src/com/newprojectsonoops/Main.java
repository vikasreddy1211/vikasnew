package com.newprojectsonoops;///this program is for encapsulation
class student{
    private String name;
    private int rollno;
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
}
public class Main {
    public static void main(String[] args){
        student obj=new student();
        obj.setName("vikas");
        obj.setRollno(425);
        System.out.println(obj.getName()+":"+obj.getRollno());
    }
}