package com.example.manager;

public enum Class {
    
    WARRIOR(2,1,3,18,"resources/images/warrior.jpg"),
    ROGUE(1,3,2,16,"resources/images/rogue.jpg"),
    WIZARD(3,2,1,14,"resources/images/wizard.jpg");
    
    public int power,lucky,defence,life;
    public String imgURL;

    private Class(int power, int lucky, int defence, int life, String imgURL) {
        this.power = power;
        this.lucky = lucky;
        this.defence = defence;
        this.life = life;
        this.imgURL = imgURL;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLucky() {
        return lucky;
    }

    public void setLucky(int lucky) {
        this.lucky = lucky;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
    
    
    
}
