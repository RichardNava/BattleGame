package com.example.manager;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "playerManager")
@ApplicationScoped
public class PlayerManager {

    private Player player1;
    private Player player2;
    private String player1Name;
    private String player2Name;
    private String class1;
    private String class2;
    private int player1Life;
    private int player2Life;
    private String message;

    public PlayerManager() {

    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    public int getPlayer1Life() {
        return player1Life;
    }

    public void setPlayer1Life(int player1Life) {
        this.player1Life = player1Life;
    }

    public int getPlayer2Life() {
        return player2Life;
    }

    public void setPlayer2Life(int player2Life) {
        this.player2Life = player2Life;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String createPlayers() {
        if (!this.player1Name.isBlank() && !this.player2Name.isBlank()) {
            player1 = new Player(player1Name, Class.valueOf(class1));
            player2 = new Player(player2Name, Class.valueOf(class2));
            player1Life = player1.getClasse().life;
            player2Life = player2.getClasse().life;
            this.message = "";
            return "arena";
        }
        this.message = "Debes introducir los nombres de los jugadores para continuar";
        return "";
    }

    public void battle() {
        int ranNumbPlay1 = (int) (Math.random() * (10 + player1.getClasse().power) + player1.getClasse().lucky);
        int ranNumbPlay2 = (int) (Math.random() * (10 + player2.getClasse().power) + player2.getClasse().lucky);

        if (ranNumbPlay1 > ranNumbPlay2) {
            int damage = ((ranNumbPlay1 - ranNumbPlay2) > player2.getClasse().defence)
                    ? ranNumbPlay1 - (ranNumbPlay2 + player2.getClasse().defence)
                    : 1;
            player2Life -= damage;
            message = this.player1.getName() + " inflige " + damage + " de daño a " + player2.getName();

        } else if (ranNumbPlay1 < ranNumbPlay2) {
            int damage = ((ranNumbPlay2 - ranNumbPlay1) > player1.getClasse().defence)
                    ? ranNumbPlay2 - (ranNumbPlay1 + player1.getClasse().defence)
                    : 1;
            player1Life -= damage;
            message = this.player2.getName() + " inflige " + damage + " de daño a " + player1.getName();
        } else {
            message = "Han empatado el combate.";
        }

    }
    public String evaluateBattle(){
        if(player1Life<=0){
            return this.player2Name + " gana el combate!!!!";
        }
        if(player2Life<=0){
            return this.player1Name + " gana el combate!!!!";          
        }
        return "";
    }
    public String resetValues(){
        this.message = "";
        this.player1 = null;
        this.player2 = null;
        this.player1Name = "";
        this.player2Name = "";
        return "index";
    }
}
