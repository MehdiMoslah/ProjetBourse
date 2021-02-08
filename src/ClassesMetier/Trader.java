/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> actions;
    
    public Trader(int IdTrader, String NomTrader)
    {
        idTrader = IdTrader;
        nomTrader = NomTrader;
        actions = new ArrayList<>();
    }

    public int getIdTrader() {
        return idTrader;
    }

    public String getNomTrader() {
        return nomTrader;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
    
}
