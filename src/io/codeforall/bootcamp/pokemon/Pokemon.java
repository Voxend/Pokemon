package io.codeforall.bootcamp.pokemon;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

abstract class Pokemon {

    private String name;
    private String type;
    private int maxHP;
    private int currentHP;
    private Rectangle hpBar;
    private Picture sprite;
    private boolean dead;

    public boolean isDead() {
        if (currentHP <= 0) {
            return true;
        }
        return false;
    }


    }
