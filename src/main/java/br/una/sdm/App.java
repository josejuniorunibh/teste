package br.una.sdm;

import br.una.sdm.entidades.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Pet p1 = new Pet(1L, "Bob", null, "Golden");
        Pet p2 = new Pet(1L, "Bob", null, "Golden");
        if (p1.equals(p2)){
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }


    }
}
