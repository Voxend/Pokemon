package io.codeforall.bootcamp.pokemon;

    import org.academiadecodigo.simplegraphics.graphics.Rectangle;
    import org.academiadecodigo.simplegraphics.graphics.Text;
    import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pokemon {

    private String name;
    private String type;
    int maxHP = 500;
    int currentHP = maxHP;
    private Picture sprite;
    private boolean dead = false;
    private Rectangle hpBar;
    private Text currentHpText;

    public Pokemon(Picture sprite) {
        this.sprite = sprite;

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
}