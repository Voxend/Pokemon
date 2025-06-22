package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Pokemon p1;
    private Pokemon p2;
    private Picture picture;
    private MyKeyboardHandle keyboardHandle;
    private boolean isStarted = false;
    private Text attackText;

    public Game(Pokemon p1,Pokemon p2) {

        this.p1 = p1;
        this.p2 = p2;
        this.picture = new Picture(10,10,"resources/image.png");
        picture.draw();
        keyboardHandle= new MyKeyboardHandle();
        this.attackText = new Text(310, 470,"Dragonite is starting");

    }

    public void init(){

        p1.getSprite().draw();
        p1.getSprite().grow(-20,-20);
        p2.getSprite().draw();
        p2.getSprite().grow(-170,-170);

        Rectangle dragoniteHPbg = new Rectangle(630 , 484 , 500/1.75 , 38);
        dragoniteHPbg.fill();
        dragoniteHPbg.setColor(Color.GRAY);

        Rectangle dragoniteHP = new Rectangle(630 , 490 , 500/1.75 , 28);
        p1.setHpBar(dragoniteHP);
        dragoniteHP.fill();
        dragoniteHP.setColor(Color.GREEN);
        Picture dragHp = new Picture(590 ,480 , "resources/hpbar.png");
        dragHp.draw();
        dragHp.grow(-17,0);

        Text maxHpDrag = new Text(970,501,"/500");
        maxHpDrag.draw();
        maxHpDrag.grow(10,15);

        Text currentHpDrag = new Text(946,501,"500");
        p1.setCurrentHpText(currentHpDrag);
        currentHpDrag.draw();
        currentHpDrag.grow(10,15);


        //P2

        Rectangle ratHPbg = new Rectangle(75 , 25 , 500/1.75 , 38);
        ratHPbg.fill();
        ratHPbg.setColor(Color.GRAY);

        Rectangle rattataHP = new Rectangle(75 , 29, 500/1.75 , 28);
        p2.setHpBar(rattataHP);
        Picture ratHp = new Picture(36,19 , "resources/hpbar.png");
        rattataHP.fill();
        rattataHP.setColor(Color.GREEN);
        ratHp.draw();
        ratHp.grow(-17,0);

        Text maxHpRat = new Text(418,41,"/500");
        maxHpRat.draw();
        maxHpRat.grow(10,15);

        Text currentHpRat = new Text(394,41,"500");
        p2.setCurrentHpText(currentHpRat);
        currentHpRat.draw();
        currentHpRat.grow(10,15);



        //TEXT BOX
        Picture textBox = new Picture(130,400, "resources/textbox.png");
        textBox.draw();
        attackText.draw();
        attackText.grow(70,30);









    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public boolean isStarted(){
        return isStarted;
    }

    public Text getAttackText(){
        return attackText;
    }




}
