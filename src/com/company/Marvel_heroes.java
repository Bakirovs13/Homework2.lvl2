package com.company;

public class Marvel_heroes implements Printable{

    private String realname;
    private String  heroic_nickname;
    private String superAbility;

    public Marvel_heroes(String realname,String heroic_nickname, String superAbility) {
        this.realname = realname;
        this.heroic_nickname = heroic_nickname;
        this.superAbility = superAbility;
    }

    @Override
    public String print() {

        System.out.println("real name: "+ realname+
                "\nHeroic_name: "+ heroic_nickname+
                "\nHero Super ability: "+ superAbility);

        return null;
    }
}
