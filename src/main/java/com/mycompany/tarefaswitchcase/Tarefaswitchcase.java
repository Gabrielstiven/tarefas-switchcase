

package com.mycompany.tarefaswitchcase;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;


public class Tarefaswitchcase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        int num1;
        char letra;
        


        
        /*System.out.println("escreva um numero de 1 a 4, com\n 1-verão\n 2-inverno\n 3-primavera\n 4-outono");
        num1 = teclado.nextInt();
        
        /*switch (num1){
            case 1 -> System.out.println("verão");
            case 2 -> System.out.println("inverno");
            case 3 -> System.out.println("primavera");
            case 4 -> System.out.println("outono");
            default -> System.out.println("numero inválido");
            */
        
        /*System.out.println("escreva um numero de 1 a 12 sendo:\n 1-janeiro 2-fevereiro.....");
        num1 = teclado.nextInt();
        
        switch (num1){
            case 1 -> System.out.println("janeiro");
            case 2 -> System.out.println("fevereiro");
            case 3 -> System.out.println("março");
            case 4 -> System.out.println("abril");
            case 5 -> System.out.println("maio");
            case 6 -> System.out.println("junho");
            case 7 -> System.out.println("julho");
            case 8 -> System.out.println("agosto");
            case 9 -> System.out.println("setembro");
            case 10 -> System.out.println("outubro");
            case 11 -> System.out.println("novembro");
            case 12 -> System.out.println("dezembro");
            */
        
                
        /*System.out.println("escreva uma letra vogal maiúscula ou minuscula, vogal ou consoante");
        letra = teclado.next().charAt(0);
        
        switch (letra){
        case 'A' -> System.out.println("vogal maiúscula");
        case 'a' -> System.out.println("vogal minúscula");
        case 'E' -> System.out.println("vogal maiúscula");
        case 'e' -> System.out.println("vogal minuscula");
        case 'O' -> System.out.println("vogal maiúscula");
        case 'o' -> System.out.println("vogal minuscula");
        case 'U' -> System.out.println("vogal maiúscula");
        case 'u' -> System.out.println("vogal minuscula");
        default -> System.out.println("consoante");
        */
        
        System.out.println("escreva um numero inteiro entre 1 e 3");
        num1 = teclado.nextInt();
        
        switch (num1){
            case 1 ->System.out.println("numero 1\n número não é maior que 2");
            case 2 ->System.out.println("numero 2");
            case 3 ->{System.out.println("numero 3");
            
            
            if (num1 > 2)
            System.out.println("maior que o número 2 e 1");
            break;
            }
            default ->System.out.println("número não é 1,2 ou 3");
        }}
        
            
                    
        }

        
            


 
        }
            
            
    }






