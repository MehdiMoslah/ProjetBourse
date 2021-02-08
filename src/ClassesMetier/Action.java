/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    
    private int idAction;
    private String nomAction;
    private double valeurAction;
    private double prixAchat;
    private int quantiteAchat;
    
    public Action(int unId, String uneAction, double laValeur, double lePrix, int laQuantite)
    {
        idAction = unId;
        nomAction = uneAction;
        valeurAction = laValeur;
        prixAchat = lePrix;
        quantiteAchat = laQuantite;
    }

    public int getIdAction() {
        return idAction;
    }

    public String getNomAction() {
        return nomAction;
    }

    public double getValeurAction() {
        return valeurAction;
    }

    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }


    public double getPrixAchatAction() {
        return prixAchat;
    }

    public int getQuantiteAchatAction() {
        return quantiteAchat;
    }


    public void setQuantiteAchatAction(int quantiteAchatAction) {
        this.quantiteAchat = quantiteAchatAction;
    }
    
    
}
