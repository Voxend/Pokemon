package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    private Pokemon p1;
    private Pokemon p2;
    private Picture picture;

    public Game(Pokemon p1,Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.picture = new Picture(10,10,"resources/image.png");
        picture.draw();
        p1.getSprite().draw();
        p1.getSprite().grow(-20,-20);
        p2.getSprite().draw();
        p2.getSprite().grow(-170,-170);
    }



//    public void start(){
//        while ()
//    }


}

