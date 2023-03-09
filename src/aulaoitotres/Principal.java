package aulaoitotres;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculos cal = new Calculos();
        
        int num1;
        int num2;
        
        System.out.println("Digite dois números para descobrir a diferença da divisão deles:");
        
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println("O resultado é:  "+cal.resto(num1, num2));
        
    }
    
}
