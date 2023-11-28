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
public class M2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        user.nama = "Iqbal";
        user.Email = "Iqbal@gmail.com";
        System.out.println(user.nama);
        System.out.println(user.Email);
        user.login();
        user.logout();
        
       Seller seller = new Seller();
       seller.get_perusahaan();
        seller.login();
        seller.logout();
    }
    
}
