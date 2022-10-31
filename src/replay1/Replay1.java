/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package replay1;

/**
 *
 * @author admin
 */
public class Replay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String s="fwfj";
       if(s.charAt(0)==s.charAt(1)){
           System.out.println(s.substring(1));
       }else{
           System.out.println(s.substring(0));
           
       }
       if(s.charAt(1)==s.charAt(2)){
           System.out.println(s.substring(2));
       }else{
           System.out.println(s.substring(1));
       }
       if(s.charAt(2)==s.charAt(3)){
           System.out.println(s.substring(3));
       }else{
           System.out.println(s.substring(3));
       }
    }
    
}
