package com.company;

import java.util.Scanner;

public class Iron_man extends Marvel_heroes{

    private String about;

    public void setAbout(String about) {
        this.about = about;
    }

    public Iron_man(String realname, String heroic_nickname, String superAbility) {
        super(realname, heroic_nickname, superAbility);

    }



    @Override
    public String print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("guess who these words belong to?"  + about +"\nAnswers: " +
                "\nIron man -1 "
                +"\nSpider-man -2"+"\nThor -3"+"\n_______________________________________");

       int answer = scanner.nextInt();
       if (answer==1){
           System.err.println("yes,the answer is correct! These words are belongs to our brilliant Iron Man."+"\nlet's read some interesting facts about him below");
       }else{
           System.err.println("incorrect answer.Try again!");
       }
        super.print();
        return null;
    }
}
