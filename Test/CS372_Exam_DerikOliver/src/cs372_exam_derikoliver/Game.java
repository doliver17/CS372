/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs372_exam_derikoliver;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The main class for the UnderOver program
 * Keeps track of users and their balances
 * @author doliver17
 */
public class Game {
    private Dice dice = new Dice();
    private ReaderWriter ReadWrite = new ReaderWriter();
    private HashMap<String, Integer> users = new HashMap<String, Integer>();
    private String currentPlayer = "";
    private Integer D1, D2;
    
    /**
     * Reads all of the users and their balances from a txt file
     */
    public void Read() throws IOException {
       users = ReadWrite.Read();        
    }
    
    /**
     * Saves all of the users and their balances to a txt file
     */
    public void Save() {
        ReadWrite.Write(users);
    }
    
    /**
     * Checks if the new user has played before, if not creates a new user
     * Sets the current player
     * @param name The user playing
     */
    public void NewPlayer(String name) {
       if(!users.containsKey(name)) {
            users.put(name, 500);
       }            
       currentPlayer = name;
    }
    
    /**
     * Getter function for the current player's balance
     * @return The current player's balance
     */
    public Integer GetPlayerBalance() {
        return users.get(currentPlayer);
    }
    
    /**
     * Getter function for dice 1
     * @return Returns the value of dice 1
     */
    public Integer getD1() {
        return D1;
    }
    
    /**
     * Getter function for dice 2
     * @return Returns the value of dice 2
     */
    public Integer getD2() {
        return D2;
    }
    
    
    /**
     * The main function of the Game class -- Decides whether the user won or not
     * Also updates the users balance
     * @param Mbet The value of the user's bet
     * @param choice Which outcome the user has chosen
     * @return If the user won or not
     */
    public boolean Play(int Mbet, int choice) {
        D1 = dice.Roll();
        D2 = dice.Roll();
        int x = D1 + D2;
        boolean win = false;
        switch(choice){
            case 0:
                if(x < 7) {
                    users.replace(currentPlayer, GetPlayerBalance() + 2*Mbet);
                    win = true;
                }
                else
                    users.replace(currentPlayer, GetPlayerBalance() - Mbet);
                break;
            case 1:
                if(x == 7) {
                    users.replace(currentPlayer, GetPlayerBalance() + 4*Mbet);
                    win = true;
                }
                else
                    users.replace(currentPlayer, GetPlayerBalance() - Mbet);
                break;
            case 2:
                if(x > 7) {
                    users.replace(currentPlayer, GetPlayerBalance() + 2*Mbet);
                    win = true;
                }
                else
                    users.replace(currentPlayer, GetPlayerBalance() - Mbet);
                break;
        }
        this.Save();
        return win;
    }       
}
