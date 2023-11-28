/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2;

/**
 *
 * @author User
 */
public class Seller extends User {
    private String perusahaan = "ABC";
    
    public void get_perusahaan (){
        System.out.println("Perusahaan saya Bernama" + perusahaan);
    }
    public void login(){
    System.out.println("Seller Login");
}
    public void logout(){
    System.out.println("Seller Logout");
    }
}
