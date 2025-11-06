package com.fahami.cda;

import com.fahami.cda.exception.BlankInputException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try{
          String saisie = inputFromUser();
            IO.println(saisie);

        }catch(BlankInputException e){
            e.printStackTrace();
        }
    }

    public static String inputFromUser() throws BlankInputException {
        String saisieUtilisateur = IO.readln("Ecrire quelque chose");
        if(saisieUtilisateur.isBlank()){
            throw new BlankInputException("La saisie utilisateur ne peut pas être vide");
        }

        return saisieUtilisateur;
    }
}