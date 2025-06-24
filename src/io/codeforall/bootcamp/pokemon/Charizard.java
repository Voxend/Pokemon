package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Charizard extends Pokemon{

    private int attack1;
    private int attack2;
    private int attack3;
    private int attack4;

    private String attack1Name;
    private String attack2Name;
    private String attack3Name;
    private String attack4Name;

    private boolean currentTurn = false;

    public Charizard() {

        this.attack1 = 70;
        this.attack2 =30;
        this.attack3 =120;
        this.attack4 = 170;

        this.attack1Name = "Outrage";
        this.attack2Name = "Outrage";
        this.attack3Name = "Outrage";
        this.attack4Name = "Outrage";

    }

    @Override
    public void attack1(Pokemon pokemon){

        pokemon.currentHP -= attack1;
        System.out.println("Charizard used fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack2(Pokemon pokemon){

        pokemon.currentHP -= attack2;
        System.out.println("Charizard used tackle");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack3(Pokemon pokemon){

        pokemon.currentHP -= attack3;
        System.out.println("Charizard used Hyper Fang");
        System.out.println("Dragonite HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack4(Pokemon pokemon){

        pokemon.currentHP -= attack4;

        System.out.println("Charizard used Surf");
        System.out.println("Dragonite HP: " + pokemon.currentHP +"\n");

    }

    public boolean getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(boolean turn){
        this.currentTurn = turn;
    }

//    public int getSurf() {
//        return surf;
//    }

    @Override
    public void setHpBar(Rectangle hpBar) {
        super.setHpBar(hpBar);
    }

    @Override
    public Rectangle getHpBar() {
        return super.getHpBar();
    }

    public int getAttack1() {
        return attack1;
    }

    public int getAttack2() {
        return attack2;
    }

    public int getAttack3() {
        return attack3;
    }

    public int getAttack4() {
        return attack4;
    }
    public String getAttack2Name() {
        return attack2Name;
    }

    public String getAttack1Name() {
        return attack1Name;
    }

    public String getAttack3Name() {
        return attack3Name;
    }

    public String getAttack4Name() {
        return attack4Name;
    }

    @Override
    public String toString(){
        return "Charizard";
    }
}
