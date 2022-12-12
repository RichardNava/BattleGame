package com.example.manager;

public class Player {
    
    private String name;
    private Class classe;

    public Player() {
    }

    public Player(String name, Class classe) {
        this.name = name;
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClasse() {
        return classe;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }
    
    
    
}
