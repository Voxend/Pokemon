package io.codeforall.bootcamp.pokemon;

public class Gyarados extends Pokemon{
    private int attack1;
    private int attack2;
    private int attack3;
    private int attack4;

    private String attack1Name;
    private String attack2Name;
    private String attack3Name;
    private String attack4Name;


    private boolean currentTurn = true;

    public Gyarados(){

        this.attack1 = 120;
        this.attack2 = 85;
        this.attack3 = 55;
        this.attack4 = 40;

        this.attack1Name = "Outrage";
        this.attack2Name = "Dragon claw";
        this.attack3Name = "Dragon Breath";
        this.attack4Name = "Twister";

    }

    @Override
    public void attack1(Pokemon pokemon){

        pokemon.currentHP -= attack1;

        System.out.println("Dragonite used Outrage");

        System.out.println("Charizard HP: " + pokemon.currentHP + "\n");


    }

    @Override
    public void attack2(Pokemon pokemon){

        pokemon.currentHP -= attack2;

        System.out.println("Dragonite used Hurricane");
        System.out.println("Charizard HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void  attack3(Pokemon pokemon){

        pokemon.currentHP -= attack3;
        System.out.println("Dragonite used Wing Attack");
        System.out.println("Charizard HP: " + pokemon.currentHP + "\n");

    }

    @Override
    public void attack4(Pokemon pokemon){

        pokemon.currentHP -= attack4;
        System.out.println("Dragonite used Tackle");
        System.out.println("Charizard HP: " + pokemon.currentHP + "\n");

    }

    public boolean getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(boolean turn){
        this.currentTurn = turn;
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
        return "Gyarados";
    }
}
