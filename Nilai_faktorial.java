/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai_faktorial;

/**
 *
 * @author user
 */
public class Nilai_faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hasil = rekursif(4);
        System.out.println(hasil);
    }
    
    public static Integer rekursif(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * rekursif(n-1);
        }
    }  
    }
    

