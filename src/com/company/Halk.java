package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Halk extends Marvel_heroes{





    public Halk(String realname, String heroic_nickname, String superAbility) {
        super(realname, heroic_nickname, superAbility);
    }

    @Override
    public String print() {
        System.out.println("\nHalk:");
        super.print();

        return null;
    }



    public void turnintoHalk(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Is it evening or not?
                     1) - Yes
                    2) - No""");
            int answer = scanner.nextInt();
            if (answer==1){

                System.out.println("Bruce is transforming into the Hulk");
            }else{
                System.out.println("Evening has not yet come, Bruce has not transformed into the Hulk");
            }
        }catch (InputMismatchException e){
            System.out.println("answer 1 or 2 is accepted, do not enter words or values other than 1 or 2");
        }

    }



}
