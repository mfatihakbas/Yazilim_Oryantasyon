package com.mycompany.yazilimoryantasyonodev7;
import java.util.Scanner;

public class YazilimOryantasyonOdev7 {

    public static void main(String[] args) {
    // 3 sınav notu girilen öğrencinin ortalamasını ve dersten geçme kalma durumunu gösteren program
    Scanner input=new Scanner(System.in);
    System.out.println("1. Sınav Notunuzu Giriniz");
    double sinav1= input.nextDouble();
    
    System.out.println("2. Sınav Notunuzu Giriniz");
    double sinav2= input.nextDouble();
    
    System.out.println("3. Sınav Notunuzu Giriniz");
    double sinav3= input.nextDouble();
    
    double ort=(sinav1+sinav2+sinav3)/3;
    
    if(ort>=50){
    System.out.println("Ortalamanız: " +ort+ "  Dersi Geçtiniz");
    }
    else{
    System.out.println("Ortalamanız: " +ort+ "  Dersi Geçemediniz");
    }
    
    }
}
