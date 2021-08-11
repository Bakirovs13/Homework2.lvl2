package com.company;

public class Captain_America extends Marvel_heroes{

   private int Age;


    public Captain_America(String realname, String heroic_nickname, String superAbility) {
        super(realname, heroic_nickname, superAbility);

    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String print() {
        System.out.println( "Captain America:" +"\nAge :"+Age+"");
        return super.print();
    }
}
