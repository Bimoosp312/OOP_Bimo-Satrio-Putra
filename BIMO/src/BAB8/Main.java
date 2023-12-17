package BAB8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BIMO 
 */
public class Main {
    public static void main(String[]args ){
        Payment pay1 = new Payment(750000);
        
        pay1.titlePurchase(1);
        System.out.println("credit Balance :"+ pay1.creditBalance);
        System.out.println("Emoney Balance :"+ pay1.emoneyBalance);
        System.out.println("Cash Balance : "+ pay1.cashBalance);
        System.out.println("======================================");
        System.out.println("total payment : "+ pay1.total);
        System.out.println("======================================");
        System.out.println("payment With credit, Ending Balance :"+ pay1.creditProses());
        System.out.println("payment with E-Money, Ending Balance :"+ pay1.emoneyProses());
        System.out.println("payment Cash, Ending Balance :"+ pay1.cashProses());
    }
}
