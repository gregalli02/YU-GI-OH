package sample;

import javafx.scene.image.Image;

public class Carta {
    private String name;
    private int level;
    private int attack;
    private int defence;
    private int position;
    private Image image;

    public Carta(String name, int level, int attack, int defence, Image image) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defence = defence;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPosition(int i){ //0 == attacco, 1 == difesa
        position = i;
    }

    public int getPosition(){
        return position;
    }

    public Image getImage() {
        return image;
    }
}
