package io.codeforall.bootcamp.pokemon;

    import org.academiadecodigo.simplegraphics.graphics.Rectangle;
    import org.academiadecodigo.simplegraphics.pictures.Picture;
//import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pokemon {

    private String name;
    private String type;
    int maxHP = 500;
    int currentHP = maxHP;
    private Picture sprite;
    private boolean dead = false;
    private Rectangle hpBar;


    public Pokemon(Picture sprite) {
        this.sprite = sprite;
//        hpBar =  new Rectangle(700,500,currentHP/1.75,35);

    }

    public boolean isDead() {
        if (currentHP <= 0) {
            dead = true;
            System.out.println("fainted");
            return true;

        }
        return false;
    }

    public Picture getSprite() {
        return sprite;
    }
    //    public void useMove(Pokemon opponent, Move move) {
//
//        opponent.currentHP -= move.getPower();
//        System.out.println(opponent.currentHP);
//        if(opponent.currentHP <= 0){
//            opponent.isDead();
//
//        }
//    }

    public boolean getDead() {
        return dead;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setSprite(Picture sprite) {
        this.sprite = sprite;
    }

    public void setHpBar(Rectangle hpBar) {
        this.hpBar = hpBar;
    }

    public Rectangle getHpBar() {
        return hpBar;
    }
}