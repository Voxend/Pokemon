package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Pokemon p1;
    private Pokemon p2;
    private Picture picture;

    private boolean isStarted = false;
    private Text attackText;
    private boolean p1Turn = true;
    private boolean p2Turn = false;
    private boolean p1Choosed = false;
    private boolean p2Choosed = false;

    private Rectangle p1Hpbar;
    private Rectangle p2Hpbar;
    private Text currentHPp1;
    private Text currentHPp2;
     private Picture choosingScreen = new Picture(10, 10, "resources/P1.png");

    public Game() {


        this.picture = new Picture(10,10,"resources/image.png");
        picture.draw();

        this.attackText = new Text(310, 470,"What will Dragonite do?");

    }

    public void init(){

        //p1
        Rectangle dragoniteHPbg = new Rectangle(630 , 484 , 500/1.75 , 38);
        dragoniteHPbg.fill();
        dragoniteHPbg.setColor(Color.GRAY);

        p1Hpbar = new Rectangle(630 , 490 , 500/1.75 , 28);

        p1Hpbar.fill();
        p1Hpbar.setColor(Color.GREEN);
        Picture dragHp = new Picture(590 ,480 , "resources/hpbar.png");
        dragHp.draw();
        dragHp.grow(-17,0);

        Text maxHpDrag = new Text(970,501,"/500");
        maxHpDrag.draw();
        maxHpDrag.grow(10,15);

        currentHPp1 = new Text(946,501,"500");
        currentHPp1.draw();
        currentHPp1.grow(10,15);

        if(p1 instanceof Dragonite){
            Picture p1Sprite = new Picture(150,100,"resources/dragonite_back.png");
            p1Sprite.draw();
        }

        if(p1 instanceof Gyarados){
            Picture p1Sprite = new Picture(150,100,"resources/gyarados_back.png");
            p1Sprite.draw();
        }

        if(p1 instanceof Charizard){
            Picture p1Sprite = new Picture(150,100,"resources/charizard_back_gif.png");
            p1Sprite.draw();
        }
        if(p1 instanceof Eliasmon){
            Picture p1Sprite = new Picture(150,100,"resources/ratoAgain.png");
            p1Sprite.draw();
        }


        //P2

        Rectangle ratHPbg = new Rectangle(75 , 25 , 500/1.75 , 38);
        ratHPbg.fill();
        ratHPbg.setColor(Color.GRAY);

        p2Hpbar = new Rectangle(75 , 29, 500/1.75 , 28);

        Picture ratHp = new Picture(36,19 , "resources/hpbar.png");
        p2Hpbar.fill();
        p2Hpbar.setColor(Color.GREEN);
        ratHp.draw();
        ratHp.grow(-17,0);

        Text maxHpRat = new Text(418,41,"/500");
        maxHpRat.draw();
        maxHpRat.grow(10,15);

        currentHPp2 = new Text(394,41,"500");
        currentHPp2.draw();
        currentHPp2.grow(10,15);

        //TEXT BOX
        Picture textBox = new Picture(130,400, "resources/textbox.png");
        textBox.draw();
        textBox.grow(0,-30);
        textBox.translate(0,30);
        attackText.draw();
        attackText.grow(70,30);
        attackText.translate(0,30);

        choosingScreen.draw();

    }

    public void p1Attack1(){
        p1.attack1(p2);
        if(p2.currentHP <= 0){
            p2.isDead();
            currentHPp2.setText("000");

        }
        p2Hpbar.grow(-p1.getAttack1()/3.5,0);
        p2Hpbar.translate(-p1.getAttack1()/3.5,0);
        if (p2.currentHP>0) {
            currentHPp2.setText("" + (p2.currentHP));
        }
        if (p2.currentHP<100 && p2.currentHP>0) {
            currentHPp2.setText("0" + (p2.currentHP));
        }
        attackText.setText("" + p1 + " used " + p1.getAttack1Name());
    }

    public void p1Attack2(){
        p1.attack2(p2);
        if(p2.currentHP <= 0){
            p2.isDead();
            currentHPp2.setText("000");
        }
        p2Hpbar.grow(-p1.getAttack2()/3.5,0);
        p2Hpbar.translate(-p1.getAttack2()/3.5,0);
        if (p2.currentHP>0) {
            currentHPp2.setText("" + (p2.currentHP));
        }
        if (p2.currentHP<100 && p2.currentHP>0) {
            currentHPp2.setText("0" + (p2.currentHP));
        }
        attackText.setText("" + p1 + " used " + p1.getAttack2Name());
    }

    public void p1Attack3(){
        p1.attack3(p2);
        if(p2.currentHP <= 0){
            p2.isDead();
            currentHPp2.setText("000");

        }
        p2Hpbar.grow(-p1.getAttack3()/3.5,0);
        p2Hpbar.translate(-p1.getAttack3()/3.5,0);
        if (p2.currentHP>0) {
            currentHPp2.setText("" + (p2.currentHP));
        }
        if (p2.currentHP<100 && p2.currentHP>0) {
            currentHPp2.setText("0" + (p2.currentHP));
        }
        attackText.setText("" + p1 + " used " + p1.getAttack3Name());
    }

    public void p1Attack4(){
        p1.attack4(p2);
        if(p2.currentHP <= 0){
            p2.isDead();
            currentHPp2.setText("000");

        }
        p2Hpbar.grow(-p1.getAttack4()/3.5,0);
        p2Hpbar.translate(-p1.getAttack4()/3.5,0);
        if (p2.currentHP>0) {
            currentHPp2.setText("" + (p2.currentHP));
        }
        if (p2.currentHP<100 && p2.currentHP>0) {
            currentHPp2.setText("0" + (p2.currentHP));
        }
        attackText.setText("" + p1 + " used " + p1.getAttack4Name());
    }

    public void p2Attack1(){
        p2.attack1(p1);
        if(p1.currentHP <= 0){
            p1.isDead();
            currentHPp1.setText("000");

        }
        p1Hpbar.grow(-p2.getAttack1()/3.5,0);
        p1Hpbar.translate(p2.getAttack1()/3.5,0);
        if (p1.currentHP>0) {
            currentHPp1.setText("" + (p1.currentHP));
        }
        if (p1.currentHP<100 && p1.currentHP>0) {
            currentHPp1.setText("0" + (p1.currentHP));
        }
        attackText.setText("" + p2 + " used " + p2.getAttack1Name());
    }

    public void p2Attack2(){
        p2.attack2(p1);
        if(p1.currentHP <= 0){
            p1.isDead();
            currentHPp1.setText("000");

        }
        p1Hpbar.grow(-p2.getAttack2()/3.5,0);
        p1Hpbar.translate(p2.getAttack2()/3.5,0);
        if (p1.currentHP>0) {
            currentHPp1.setText("" + (p1.currentHP));
        }
        if (p1.currentHP<100 && p1.currentHP>0) {
            currentHPp1.setText("0" + (p1.currentHP));
        }
        attackText.setText("" + p2 + " used " + p2.getAttack2Name());
    }

    public void p2Attack3(){
        p2.attack3(p1);
        if(p1.currentHP <= 0){
            p1.isDead();
            currentHPp1.setText("000");

        }
        p1Hpbar.grow(-p2.getAttack3()/3.5,0);
        p1Hpbar.translate(p2.getAttack3()/3.5,0);
        if (p1.currentHP>0) {
            currentHPp1.setText("" + (p1.currentHP));
        }
        if (p1.currentHP<100 && p1.currentHP>0) {
            currentHPp1.setText("0" + (p1.currentHP));
        }
        attackText.setText("" + p2 + " used " + p2.getAttack3Name());
    }

    public void p2Attack4(){
        p2.attack4(p1);
        if(p1.currentHP <= 0){
            p1.isDead();
            currentHPp1.setText("000");

        }
        p1Hpbar.grow(-p2.getAttack4()/3.5,0);
        p1Hpbar.translate(p2.getAttack4()/3.5,0);
        if (p1.currentHP>0) {
            currentHPp1.setText("" + (p1.currentHP));
        }
        if (p1.currentHP<100 && p1.currentHP>0) {
            currentHPp1.setText("0" + (p1.currentHP));
        }
        attackText.setText("" + p2 + " used " + p2.getAttack4Name());
    }

    public void drawDraganiteFront(){
        Picture p1Sprite = new Picture(100,100,"resources/dragonite_back.png");
        p1Sprite.draw();
    }

    public void drawCharizardFront(){
        Picture p1Sprite = new Picture(100,100,"resources/charizard_back_gif.png");
        p1Sprite.draw();
    }

    public void drawGyaradosFront(){
        Picture p1Sprite = new Picture(100,100,"resources/gyarados_back.png");
        p1Sprite.draw();
    }

    public void drawEliasmonFront(){
        Picture p1Sprite = new Picture(100,100,"resources/ratRip.png");
        p1Sprite.draw();
    }

    public void drawDraganiteBack(){
        Picture p2Sprite = new Picture(600,40,"resources/dragonite_front.png");
        p2Sprite.draw();
    }

    public void drawCharizardBack(){
        Picture p2Sprite = new Picture(600,30,"resources/charizard_front.png");
        p2Sprite.draw();
    }

    public void drawGyaradosBack(){
        Picture p2Sprite = new Picture(600,40,"resources/gyarados_front.png");
        p2Sprite.draw();
    }

    public void drawEliasmonBack(){
        Picture p2Sprite = new Picture(600,40,"resources/ratRip.png");
        p2Sprite.draw();
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

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public Pokemon getP1() {
        return p1;
    }

    public Pokemon getP2() {
        return p2;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

    public boolean isP1Turn() {
        return p1Turn;
    }

    public boolean isP2Turn() {
        return p2Turn;
    }

    public void setP1Turn(boolean p1Turn) {
        this.p1Turn = p1Turn;
    }

    public void setP2Turn(boolean p2Turn) {
        this.p2Turn = p2Turn;
    }

    public boolean isP1Choosed() {
        return p1Choosed;
    }

    public void setP1Choosed(boolean p1Choosed) {
        this.p1Choosed = p1Choosed;
    }

    public boolean isP2Choosed() {
        return p2Choosed;
    }

    public void setP2Choosed(boolean p2Choosed) {
        this.p2Choosed = p2Choosed;
    }

    public Picture getChoosingScreen() {
        return choosingScreen;
    }
}
