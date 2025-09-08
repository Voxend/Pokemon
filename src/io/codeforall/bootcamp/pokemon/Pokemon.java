package io.codeforall.bootcamp.pokemon;

    import org.academiadecodigo.simplegraphics.graphics.Rectangle;
    import org.academiadecodigo.simplegraphics.graphics.Text;
    import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Pokemon {

    private int attack1;
    private int attack2;
    private int attack3;
    private int attack4;

    private String attack1Name;
    private String attack2Name;
    private String attack3Name;
    private String attack4Name;

    private String name;
    private String type;
    int maxHP = 500;
    int currentHP = maxHP;
    private Picture sprite;
    private boolean dead = false;
    private Rectangle hpBar;
    private Text currentHpText;

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

    public boolean getDead() {
        return dead;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setHpBar(Rectangle hpBar) {
        this.hpBar = hpBar;
    }

    public Rectangle getHpBar() {
        return hpBar;
    }

    public void setCurrentHpText(Text currentHpText) {
        this.currentHpText = currentHpText;
    }

    public Text getCurrentHpText() {
        return currentHpText;
    }

    public abstract void attack1(Pokemon pokemon);
    public abstract void attack2(Pokemon pokemon);
    public abstract void attack3(Pokemon pokemon);
    public abstract void attack4(Pokemon pokemon);

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
}