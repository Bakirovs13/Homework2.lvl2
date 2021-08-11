package com.company;

public class Main {

    public static void main(String[] args) {



        createObject("Captain_America").print();
        createObject("Halk").print();
        createObject("Iron_man").print();
    }


    public static Marvel_heroes createObject(String className) {

        switch (className) {

            case "Captain_America":
                Captain_America captain_america = new Captain_America("Steven Rogers", "Captain America", "Peak-Human Condition, Accelerated Healing Factor, Enhanced Intelligence, Longevity");
                captain_america.setAge(93);
                return captain_america;


            case "Halk":
                Halk halk = new Halk("Bruce Banner", "Halk", "Superhuman strength, invulnerability, anger empowerment, regeneration");
                return halk;



            case "Iron_man":
                Iron_man iron_man = new Iron_man("Anthony Edward \"Tony\" Stark","Iron_man","high IQ, ingenuity and an iron suit that helps to fly and attack");

                System.out.println("___________________quiz____________________________");
                iron_man.setAbout(" “Genius, billionaire, playboy philanthropist”");


                return iron_man;


        }
        return null;
    }


}
