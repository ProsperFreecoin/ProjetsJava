/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package respectencapsulation;

/**
 *
 * @author freecoin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Article article=new Article();
       article.setDisponibilite(42);
       article.setStockMin(22);
       article.approvisionner(3);
       article.destocker(2);
    }
    
}
