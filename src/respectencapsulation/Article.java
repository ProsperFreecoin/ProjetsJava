/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package respectencapsulation;

/**
 *
 * @author freecoin
 */
public class Article {
    private int reference;
    private String libelle; 
    private int disponibilite;
    private int stockMin;
    private boolean autorisation; 
    
    public Article(){}
    public Article(int reference, String libelle, int disponibilite, int 
            stockMin, boolean autorisation){
        this.reference=reference;
        this.libelle=libelle;
        this.disponibilite=disponibilite;
        this.stockMin=stockMin;
        this.autorisation=autorisation;             
    }


    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        if(this.disponibilite <= this.stockMin){
            System.out.println("Impossible de destocker");
        }else{
            this.disponibilite=disponibilite;
        }
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        if(this.stockMin>=this.disponibilite){
            System.out.println("Impossible de destocker");
        }else{
            this.stockMin=stockMin;
        }
    }

    public boolean isAutorisation() {
        return autorisation;
    }

    public void setAutorisation(boolean autorisation) {
        this.autorisation = autorisation;
    }
    
    public void approvisionner(int quantite){
        if(this.disponibilite<=this.stockMin){
            System.out.println("Vous ne pouvez rien ajouter");
        }else{
            this.disponibilite+=quantite;
            System.out.println("votre approvisionnement est de " +this.disponibilite);
            
        }
    }
    
    public void destocker(int quantite){
        this.disponibilite-=quantite;
        if(this.disponibilite <= this.stockMin){
            System.out.println("Vous ne pouvez pas destocker car le nombre"
                    + "dispo risque de devenir inferieur au stock minimale");
        }else{
            System.out.println("Vous pouvez destocker "+this.disponibilite);
            
        }
        
    }
}
