
package com.mycompany.yazilimoryantasyonodev6;
import java.util.Scanner;

public class YazilimOryantasyonOdev6 {

    public static void main(String[] args) {
        // Kullanıcıdan Alınan Sayının Tek veya Çift Olduğunu Belirleyen Program
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayıyı Giriniz: ");
        int sayi=input.nextInt();
        
        if(sayi%2==0){
        System.out.println(sayi + " sayısı çifttir");
        }
        else{
        System.out.println(sayi+" sayısı tektir");
        }
        
    }
}
